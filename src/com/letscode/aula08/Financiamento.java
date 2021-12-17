package com.letscode.aula08;

public class Financiamento {
    private  double valor;
    private   double entrada;
    private  int parcelas;

    public Financiamento(double valor, double entrada, int parcelas) {
        this.valor = valor;
        if ( this.entrada<this.valor *0.2){
            throw new Exception("Valor não aceitado");
        }
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public void valorDaPrestação(){

    }
}
