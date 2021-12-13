/*
package com.letscode.aula5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
*/
/*

        int[] listInteiros = new int[10];
        listInteiros[0] = 10;
        listInteiros[1] = 8;
        listInteiros[2] = 7;
        listInteiros[3] = 15;

*//*


*/
/*
        System.out.println(listInteiros.length);
        System.out.println(Arrays.toString(listInteiros));
        System.out.println(Arrays.stream(listInteiros).findFirst());
        System.out.println(Arrays.stream(listInteiros).max());
*//*



*/
/*
       for (int i = 0; i < listInteiros.length; i++) {
            if (listInteiros[i] > 0) {
                System.out.println("O númeor na posição " + i + " do array é:" + listInteiros[i]);
            }
        }
*//*

*/
/*

        int[] newList = new int[0];
        for (int i = 0; i < listInteiros.length; i++) {
            if (listInteiros[i] > 0) {
                newList = Arrays.copyOfRange(listInteiros, 0, i+1);
            }
        }
        System.out.println(Arrays.toString(newList));


        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));


        double[] arryDouble = new double[5];
        arryDouble[0] = 5.0;
        arryDouble[1] = 7.0;
        System.out.println(Arrays.toString(newList));

        boolean flag;
        Boolean outraFlag;
*//*

*/
/*
//        int[][] notasAlunos = {{1,2,3},{1,2,3},{1,2,3}};
        double[][] notasAlunos = new double[3][4];
        notasAlunos[0][0] = 8;
        notasAlunos[0][1] = 9;
        notasAlunos[0][2] = 10;
        notasAlunos[0][3] = 8;

        System.out.println(Arrays.toString(notasAlunos));

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                if (notasAlunos[i][j] > 0.0) {
                    System.out.println(notasAlunos[i][j]);
                }
            }
        }*//*


*/
/*
        Scanner sc = new Scanner(System.in);
        String[] dataString = new String[5];

//        System.out.println("Digite seu nome: ");
//        dataString[0] = sc.nextLine();
//        System.out.println(dataString);

        for (int i = 0; i < dataString.length ; i++) {
            System.out.println("Digite o nome do aluno: ");
            dataString[i] = sc.nextLine();
        }

        for (int i = 0; i < dataString.length; i++) {
            System.out.println(dataString[i]);
        }
*//*

        System.out.println("daskfjlkdjf");
        Runtime.getRuntime().exec("cls");

    }
}
*/
