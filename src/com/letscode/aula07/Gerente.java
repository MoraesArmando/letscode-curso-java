package com.letscode.aula07;

import com.letscode.aula04.Vendedor;

import java.math.BigDecimal;

public class Gerente extends Empregado{
    private int contVendedores;
    private Vendedor[] vendedores;

    public Gerente(String nome, int matricula, BigDecimal salario) {
        super(nome, matricula, salario);

        this.vendedores = new Vendedor[10];
    }

    @Override
    //visibilidade, retorno, nome, parametros, excessao
    public void baterPonto() {
        System.out.println("Gerente: Batendo o ponto....");
    }

    public void alterarCanal(){
        System.out.println("trocou de canal");
    }

    public void alterarCanal(int numeroDoCanal){
        System.out.println("alterou o canal para: " + numeroDoCanal);
    }

    public void alterarCanal(int numeroDoCanal, int numeroAparelho){
        System.out.println("alterou o canal para: " + numeroDoCanal + " aparelho: "+ numeroAparelho);
    }

    public void demitir(int indeceVendedor){
        System.out.println("Gerente demitiu...");
        this.vendedores[indeceVendedor] = null;
    }

    public void contratar(Vendedor novoVendedor){
        System.out.println("Gerente contratou....");
        this.vendedores[contVendedores] = novoVendedor;
        this.contVendedores++;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }
}
