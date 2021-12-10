package com.letscode.aula03;

import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor em reais que deseja converter: ");
        double real = scanner.nextDouble();

        ConverterMoeda(real);
    }

    private static void ConverterMoeda(double real) {
        final double dollar = 5.65;
        final double euro = 6.39;

        double realToDollar = real/dollar;
        double realToEuro = real/euro;

        System.out.printf("O valor R$ %.2f em: %n Dollar: $ %.2f%n Euro: EUR %.2f", real , realToDollar, realToEuro);

    }
}
