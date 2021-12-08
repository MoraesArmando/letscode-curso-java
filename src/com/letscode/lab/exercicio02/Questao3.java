package com.letscode.lab.exercicio02;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Infome o valor em celsius que deseja converter para fahrenheit : ");
        double celsius = Double.parseDouble(sc.nextLine().replace(",","."));

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit", celsius, fahrenheit);
    }
}

