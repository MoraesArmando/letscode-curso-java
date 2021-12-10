package com.letscode.exercicio.listPDF.pagina05;

import java.util.Scanner;

public class MenorPerco {
    public static void main(String[] args) {
        double[] produtos = new double[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Informe o valor do produto %d: ", i+1);
            produtos[i] = Double.parseDouble(sc.nextLine().replace(",", "."));
        }

        double menor = produtos[0];
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] < menor) {
                menor = produtos[i];
            }
        }
        System.out.printf("O menor preço é: %.2f", menor);
    }
}
