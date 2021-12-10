package com.letscode.exercicio.listPDF.pagina04;

import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor em reais que deseja converter: ");
        double real = Double.parseDouble(sc.nextLine().replace(",","."));

        converterValor(real);


    }

    private static void converterValor(double real) {
        final double dollar = 5.65;
        final double euro = 6.39;

        double conversaoDollar = real*dollar;
        double conversaoEuro = real*euro;

        System.out.printf("Você possui %.2f (USD) %n", conversaoDollar);
        System.out.printf("Você possui %.2f (EUR)", conversaoEuro);

    }
}
