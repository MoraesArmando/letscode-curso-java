package com.letscode.aula2;

import java.util.Scanner;

public class Avatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome para o Avatar:");
        String nome = scanner.next();
        System.out.println("Informe um tipo :");
        String tipo = scanner.next();

        System.out.print("O nome do avatar é "+ nome +" com o elmento " + Elementos.AGUA  );
    }
}
