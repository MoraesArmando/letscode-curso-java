package com.letscode.exercicio.classs.exercicio01;


public class Questao10 {

public static final float fatorDeConversao=2.20462F;

    public static void main(String[] args) {
        float kilos = 100f;
        float libras = kilos * fatorDeConversao;

        System.out.printf("%.0f kg são %.4f lb", kilos, libras);
    }
}
