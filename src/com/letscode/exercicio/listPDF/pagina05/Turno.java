package com.letscode.exercicio.listPDF.pagina05;

import java.util.Locale;
import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o turno, M->[ MATUTINO ], V->[VESPERTINO], N->[NOTURNO]: ");
        char turno = sc.next().toUpperCase(Locale.ROOT).charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("“Boa noite!");
                break;
            default:
                System.out.println("O valor digitado não corresponde as alternativas apresentadas!");
        }

    }
}
