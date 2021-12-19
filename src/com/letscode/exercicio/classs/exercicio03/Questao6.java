package com.letscode.exercicio.classs.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase(Locale.ROOT);

        int cont = 1;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (cont%2 == 0){
                System.out.print(Character.toLowerCase(letra));
            }
            if (cont%2 != 0) {
                System.out.print(Character.toUpperCase(letra));
            }
            cont += 1 ;
        }
    }
}

