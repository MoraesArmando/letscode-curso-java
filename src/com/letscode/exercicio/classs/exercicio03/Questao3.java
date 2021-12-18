package com.letscode.exercicio.classs.exercicio03;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º númemro:");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Números impares digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Números pares digitados: ");
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 2 == 0) {
                System.out.println(numeros[j]);
            }
        }

    }
}

