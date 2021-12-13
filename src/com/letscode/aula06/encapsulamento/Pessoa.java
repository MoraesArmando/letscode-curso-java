package com.letscode.aula06.encapsulamento;

public interface Pessoa {
   private String nome;

   public static String getNome(){
        return nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
}
