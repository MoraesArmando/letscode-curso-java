package com.letscode.aula04;

import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome a quantidade de produtos que deseja somar:");
        int quantidade = Integer.parseInt(sc.nextLine());

        float item = 0f;
        float total = 0f;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Informe o valor do item" + i);
            item += sc.nextFloat();
            total = item;
        }
        System.out.println("A soma total dos itens é: " + total);
    }
}
