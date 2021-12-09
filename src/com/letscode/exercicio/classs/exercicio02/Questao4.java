package com.letscode.exercicio.classs.exercicio02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Infome o valor da cotação do dollar:");
        double cotacaoDollar = Double.parseDouble(sc.nextLine().replace(",", "."));

        System.out.print("Infome o valor em reais que deseja converter: ");
        double reais = Double.parseDouble(sc.nextLine().replace(",", "."));


        converter(cotacaoDollar, reais);

    }

    private static void converter(double cotacao, double valor) {

        double coversao = cotacao * valor;

        System.out.println("O valor de " + NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor) + " convertido para dollar (com valor da cotacão à " + NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(cotacao) + ") é de:" + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(coversao));
    }
}
