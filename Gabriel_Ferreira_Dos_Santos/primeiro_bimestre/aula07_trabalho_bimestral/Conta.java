package aula07_trabalho_bimestral;

import aula07_trabalho_bimestral.utilitarios.Util;

public class Conta {
    private static int idConta = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.numeroConta = idConta;
        this.pessoa = pessoa;
        idConta += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNúmero da conta: " + this.getNumeroConta() +
               "\nNome: " + this.pessoa.getNome() +
               "\nCPF: " + this.pessoa.getCpf() +
               "\nE-mail: " + this.pessoa.getEmail() +
               "\nSaldo: " + Util.doubleToString(this.getSaldo()) + "\n";
    }

    public void depositar(Double valor){
        if(valor >0){
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Não foi possível realizar o depósito");
        }
    }

    public void sacar(Double valor){
        if (valor>0 && this.getSaldo()>= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Não foi possível realizar o saque");
        }
    }
    
    public void transferir(Conta contaParaDeposito, Double valor){
        if(valor>0 && this.getSaldo()>= valor){
            setSaldo(getSaldo()-valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso");
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }
/* 
    public void consultarBoletos(String linhaDigitavel){
        if(linhaDigitavel.length() != 47){
            System.out.println("Boleto inválido");
        }else{
            Double valor = Double.parseDouble(linhaDigitavel.substring(37, 47)) / 100;
            System.out.println("Valor do boleto: R$" + valor);
        }

    }*/


    
}
