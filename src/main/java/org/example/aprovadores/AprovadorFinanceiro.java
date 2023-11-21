package org.example.aprovadores;

import org.example.dominio.Despesa;

public class AprovadorFinanceiro implements Aprovador {

    private Aprovador nextAprovador;
    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= 1000) {
            System.out.println("Despesa aprovada pelo Departamento Financeiro.");
        } else {
            System.out.println("Despesa rejeitada pelo Departamento Financeiro.");
        }
    }

    @Override
    public void setNextAprovador(Aprovador nextAprovador) {
        // Não precisa implementar neste caso, pois é o último na cadeia.

    }
}
