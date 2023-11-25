public class Funcionario {
  private String nome;
  
  private String cargo;

  private int idade;

  private double [] salario = new double[3];

public Funcionario(String nome, String cargo, int idade, double[] salario) {
    this.nome = nome;
    this.cargo = cargo;
    this.idade = idade;
    this.salario = salario;
}

public void Apresentarse(){
    System.out.println("Olá "+nome+" \nvocê tem "+idade+" \ne trabalha como: "+ cargo);
}
  
public  double calcularMedia (){
    double soma = 0;
    for (double salario : salario) {
        soma += salario;
    }
    return soma / salario.length;
};
}


