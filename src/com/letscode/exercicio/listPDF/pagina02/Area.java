package com.letscode.exercicio.listPDF.pagina02;

public class Area {
    public static void main(String[] args) {
        double ladoQuadrado = 4.5;
        double alturaTriangulo = 5.3;
        double baseTriangulo = 4.1;

        double areaQuadrado = ladoQuadrado*ladoQuadrado;
        double areaTriangulo = (baseTriangulo*alturaTriangulo) / 2;

        System.out.printf("A área do quadrado de lado %.1f é: %.1f %n", ladoQuadrado,areaQuadrado);
        System.out.printf("A área do triangulo de lado %.1f e base %.1f é: %.1f", alturaTriangulo, baseTriangulo,areaTriangulo);
    }
}
