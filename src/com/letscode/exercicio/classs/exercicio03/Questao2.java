package com.letscode.exercicio.classs.exercicio03;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra =  sc.nextLine();
        StringBuilder inverso = new StringBuilder(palavra).reverse();
        System.out.println("A palavra invertida é: "+inverso);

    }
}
