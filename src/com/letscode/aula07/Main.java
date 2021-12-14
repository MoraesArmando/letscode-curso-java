package com.letscode.aula07;

import com.letscode.aula04.Vendedor;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      /*  //private, protected, public, default
        String nome = "nome do gerente";
        int matricula = 123;
        BigDecimal salario = new BigDecimal(12000);

        Gerente gerente = new Gerente(nome,matricula,salario);

        gerente.baterPonto();
        gerente.trabalhar();

        System.out.println(gerente.getSalario());

        gerente.alterarCanal();
        gerente.alterarCanal(10);
        gerente.alterarCanal(12,2);
*/
        Gerente gabi = new Gerente("gabi", 123,BigDecimal.valueOf(12000));

        Vendedor jorge = new Vendedor();
        jorge.nome = "Jorge";

        gabi.contratar(jorge);

        for (Vendedor vendedor: gabi.getVendedores()
             ) {
            System.out.println(vendedor.nome);
        }
    }
}
