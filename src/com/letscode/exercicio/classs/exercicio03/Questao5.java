package com.letscode.exercicio.classs.exercicio03;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] listaDeConvidados = new String[5];
        String maiorPalavra = "";

        for (int i = 0; i < listaDeConvidados.length; i++) {
            System.out.println("Informe o nome do " + (i + 1) + "º convidado: ");
            listaDeConvidados[i] = sc.nextLine().toUpperCase(Locale.ROOT);
        }

        for (int j = 0; j < listaDeConvidados.length; j++) {
            if (listaDeConvidados[j].length() > maiorPalavra.length()) {
                maiorPalavra = listaDeConvidados[j];
            }
        }
        System.out.println("O nome mais longo presente na lista é: " + maiorPalavra);
    }
}
