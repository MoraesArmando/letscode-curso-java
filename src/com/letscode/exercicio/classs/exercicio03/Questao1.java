package com.letscode.exercicio.classs.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] carrinhoDeCompras = new String[5];

        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            System.out.println("Finforme o nome da fruta nº"+ (i+1));
            carrinhoDeCompras[i] = sc.nextLine().toUpperCase(Locale.ROOT);
        }

            System.out.println("As frutas digitadas foram: ");
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            System.out.println(carrinhoDeCompras[i]);
        }

    }
}
