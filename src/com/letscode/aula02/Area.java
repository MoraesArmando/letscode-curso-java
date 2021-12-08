package com.letscode.aula02;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        int ladoQuadrado = scanner.nextInt();
        System.out.print("Digite o valor da altura do triangulo: ");
        int alturaTriangulo = scanner.nextInt();
        System.out.print("Digite o valor da base do triangulo: ");
        int baseTriangulo = scanner.nextInt();

        int areaQuadrado = ladoQuadrado * ladoQuadrado;
        int areaTriangulo = (alturaTriangulo * baseTriangulo) / 2;
        System.out.println("A area do quadrado é: " + areaQuadrado);
        System.out.println("A area do triangulo é: " + areaTriangulo);

    }
}
