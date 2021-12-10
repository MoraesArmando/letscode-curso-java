package com.letscode.aula02;

import java.util.Locale;
import java.util.Scanner;

public class Avatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome para o Avatar:");
        String nome = scanner.next();
        System.out.println("Informe um tipo [AGUA, TERRA, AR, FOGO]:");
        String tipo = scanner.next().toUpperCase();

        switch (tipo) {
            case "AGUA":
            case "TERRA":
            case "AR":
            case "FOGO":
                System.out.print("O nome do avatar é " + nome + " com o elmento " + Elementos.valueOf(tipo));
                break;
            default:
                System.out.println("Informe o valor de um elemento válido!!!");
        }
    }
}
