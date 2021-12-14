package com.letscode.aula06.encapsulamento;

public interface Pessoa {
   String nome = "";

   public static String getNome(){
        return nome;
   }
   public default void setNome(String nome){

   }
}
