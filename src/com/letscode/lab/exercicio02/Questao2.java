package com.letscode.lab.exercicio02;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Infome um número:");
        int number = Integer.parseInt(sc.nextLine());

        System.out.println("ADIÇÃO");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d + %d = %d %n", i, number, i + number);
        }
        System.out.println("SUBTRAÇÃO");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d - %d = %d %n", i, number, i - number);
        }
        System.out.println("MULTIPLICAÇÃO");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d %n", i, number, i * number);
        }
        System.out.println("DIVISÃO");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d / %d = %.2f %n", i, number, (double) i / number);
        }
    }
}

