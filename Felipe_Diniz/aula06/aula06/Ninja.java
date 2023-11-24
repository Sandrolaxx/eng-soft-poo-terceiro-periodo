package aula06;
public class Ninja {
String nome ; 
int idade;
String aldeia;
String cla;
String equipamento; 
String nomeJutso;
public Ninja(String nome, int idade, String nomeJutso){
    this.nome = nome;
    this.idade = idade;
    this.nomeJutso = nomeJutso;
}
public Ninja(){
    
}
void apresentarse(){
    System.out.println("Sou o ninja".concat(nome).concat("do clã").concat(cla));
} 
void realisarJutso(){
    System.out.println(nome.concat("realisar jutso").concat(nomeJutso));

}
}
