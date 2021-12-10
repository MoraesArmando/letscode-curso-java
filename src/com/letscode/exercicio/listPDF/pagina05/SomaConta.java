package com.letscode.exercicio.listPDF.pagina05;

import java.util.Scanner;

public class SomaConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        int cont = 1;
        double valorTotal = 0;
        while (cont <= quantidade) {
            System.out.println("Infome o valor a ser somado:");
            double valorProduto = Double.parseDouble(sc.nextLine());
            valorTotal = valorTotal + valorProduto;
            cont++;
        }

        System.out.printf("O valor total da soma é: %.2f", valorTotal);
    }
}
