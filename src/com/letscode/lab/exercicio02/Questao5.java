package com.letscode.lab.exercicio02;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Infome a medida em polegadas:");
        double polegadas =  Double.parseDouble(sc.nextLine().replace(",", "."));

        converter(polegadas);
    }

    private static void converter(double valor) {
        final double constante = 2.54f;
        double valorConvertido = constante * valor;

        System.out.printf("%.0f polegada(s) são %.4f centímetro(s)", valor, valorConvertido );
    }
}
