package com.letscode.aula07;

import java.math.BigDecimal;

public class Empregado {

    private String nome;
    private int matricula;
    private BigDecimal salario;

    public Empregado(String nome, int matricula, BigDecimal salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void baterPonto(){
        System.out.println("Batendo o ponto....");
    }

    public void trabalhar(){
        System.out.println("Trabalhando....");
    }
}
