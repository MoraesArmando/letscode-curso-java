package com.letscode.aula06;

public class Main2 {
    public static void main(String[] args) {
       Funcionario vendedor = new Vendedor();

       vendedor.nome = "Armando";
       vendedor.baterPonto();

        Diretor diretor = new Diretor(123456789);
        System.out.println(diretor.matricula);
    }
}
class Funcionario{
    long matricula;
    String nome;
    String cpf;

    public  void baterPonto(){
        System.out.println("Batendo ponto...");
    }

}

class Vendedor extends Funcionario{
    @Override
    public  void baterPonto( ){
        System.out.println("Vendedor "+ this.nome + " batendo ponto...");
    }
}

class Gerente extends  Funcionario{}

class Diretor extends  Funcionario{

    public Diretor(long matricula){
        this.matricula = matricula;
    }
}