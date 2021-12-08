package com.letscode.lab.exercicio02;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Infome o valor do primeiro número inteiro:");
        int numbOne = Integer.parseInt(sc.nextLine());
        System.out.print("Infome o valor do segundo número inteiro:");
        int numbTow = Integer.parseInt(sc.nextLine());

        int soma = numbOne + numbTow;
        int subtracao = numbOne - numbTow;
        int multiplicacao = numbOne * numbTow;
        double divisao = (double) numbOne / numbTow;

        System.out.printf("O resultado da soma entre %d e %d (%d+%d)  é: %d %n", numbOne, numbTow, numbOne, numbTow, soma);
        System.out.printf("O resultado da subtração entre %d e %d (%d-%d) é: %d %n", numbOne, numbTow, numbOne, numbTow, subtracao);
        System.out.printf("O resultado da multiplicação entre %d e %d (%d*%d) é: %d %n", numbOne, numbTow, numbOne, numbTow, multiplicacao);
        System.out.printf("O resultado da divisão entre %d e %d (%d/%d) é: %.4f %n", numbOne, numbTow, numbOne, numbTow, divisao);
    }
}

