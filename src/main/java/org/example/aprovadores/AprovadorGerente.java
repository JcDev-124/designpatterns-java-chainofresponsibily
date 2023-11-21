package org.example.aprovadores;

import org.example.dominio.Despesa;

public class AprovadorGerente implements Aprovador {

    private Aprovador nextAprovador;

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= 500) {
            System.out.println("Despesa aprovada pelo Gerente.");
        } else if (nextAprovador != null) {
            nextAprovador.aprovar(despesa);
        } else {
            System.out.println("Despesa rejeitada pelo Gerente.");
        }
    }

    @Override
    public void setNextAprovador(Aprovador nextAprovador) {
        this.nextAprovador = nextAprovador;
    }
}
