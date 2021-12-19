package com.letscode.exercicio.classs.exercicio03;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double INICIAL_IMC = 18.5;
        final double FINAL_IMC = 25.00;


        String[] pessoa = new String[5];
        Double[] altura = new Double[5];
        Double[] peso = new Double[5];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Informe o nome da "+(i+1)+"ª pessoa: ");
            pessoa[i] = sc.nextLine();
            System.out.println("Informe a altura da "+(i+1)+"ª pessoa (metro e cm - ex.: 1,70 ) ");
            altura[i] = Double.parseDouble(sc.nextLine());
            System.out.println("Informe o peso da "+(i+1)+"ª pessoa (quilos - ex: 70.5): ");
            peso[i] = Double.parseDouble(sc.nextLine());
        }

        for (int j = 0; j < pessoa.length; j++) {
            double pesoIdeal = calculaIMC(altura[j], peso[j]);
            if (INICIAL_IMC>pesoIdeal  ||  FINAL_IMC<pesoIdeal){
                System.out.println(pessoa[j] + " está fora do peso ideal. ( IMC = "+ pesoIdeal+ " )");
            }
        }
    }
    public static double calculaIMC(double altura, double peso){
        double alturaIMC = (altura*altura);
        double pessoaIMC = (peso / alturaIMC);
        return pessoaIMC;
    }
}
