package com.letscode.exercicio.listPDF.pagina02;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;
        System.out.println("Informe o valor da primeira nota: ");
        nota1 = Double.parseDouble(sc.nextLine().replace(",","."));
        System.out.println("Informe o valor da segunda nota: ");
        nota2 = Double.parseDouble(sc.nextLine().replace(",","."));
        System.out.println("Informe o valor da terceira nota: ");
        nota3 = Double.parseDouble(sc.nextLine().replace(",","."));

        double media = (nota1+nota2+nota3)/3;
        System.out.printf("A média aritimética das notas (N1 %.2f, N2 %.2f, N3 %.2f) é %.2f", nota1, nota2, nota3 , media);
    }
}
