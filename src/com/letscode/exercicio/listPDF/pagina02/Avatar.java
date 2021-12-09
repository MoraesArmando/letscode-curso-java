package com.letscode.exercicio.listPDF.pagina02;

import java.util.Locale;
import java.util.Scanner;

public class Avatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um nome ara o avatar: ");
        String nome = sc.nextLine();

        System.out.println("Informe um nome ara o avatar: ");
        String elemento = sc.nextLine().toUpperCase();

        System.out.printf("O avatar %s domina o elemento: %s", nome , Elementos.valueOf(elemento));

    }
}
