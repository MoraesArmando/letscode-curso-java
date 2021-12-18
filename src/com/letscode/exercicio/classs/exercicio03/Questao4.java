package com.letscode.exercicio.classs.exercicio03;

import java.util.Arrays;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º númemro:");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        int maior = Arrays.stream(numeros).max().getAsInt();
        int menor = Arrays.stream(numeros).min().getAsInt();
        int media = Arrays.stream(numeros).sum() / numeros.length;


        System.out.println("O maior número difitado é:" + maior);
        System.out.println("O menor número difitado é:" + menor);
        System.out.println("O media número difitado é:" + media);

    }
}

