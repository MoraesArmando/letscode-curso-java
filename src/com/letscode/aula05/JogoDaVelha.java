/*
package com.letscode.aula5;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char{{'_', '|', '_', '|', '_'},{'_', '|', '_', '|', '_'},{'_', '|', '_', '|', '_'}};

        printTabuleiro(tabuleiro);
        atualizarTabuleiro(2,1,tabuleiro);
    }

    public static void printTabuleiro(char[][] tabuleiro) {
        for (char[] row : tabuleiro) {
            for (char collum : row) {
                System.out.println(collum);
            }
            System.out.println();
        }
    }

    */
/*
        jogador1= X;
        jogador2 = O;
     *//*

    public static void atualizarTabuleiro(int posicao, int jogador, char[][] tabuleiro) {
        char character;
        if (jogador == 1){
            character = 'X';
        }else {
            character = 'O';
        }

        switch (posicao){
            case 1:
                tabuleiro[0][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 2:
                tabuleiro[0][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 3:
                tabuleiro[0][4] = character;
                printTabuleiro(tabuleiro);
                break;
            case 4:
                tabuleiro[1][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 5:
                tabuleiro[1][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 6:
                tabuleiro[1][4] = character;
                printTabuleiro(tabuleiro);
                break;
            case 7:
                tabuleiro[2][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 8:
                tabuleiro[2][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 9:
                tabuleiro[2][4] = character;
                printTabuleiro(tabuleiro);
                break;


        }
    }
}
*/
