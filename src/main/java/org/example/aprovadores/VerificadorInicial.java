package org.example.aprovadores;

import org.example.dominio.Despesa;

public class VerificadorInicial implements Aprovador {
    private Aprovador nextAprovador;

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= 100) {
            System.out.println("Despesa aprovada na Verificação Inicial.");
        } else if (nextAprovador != null) {
            nextAprovador.aprovar(despesa);
        } else {
            System.out.println("Despesa rejeitada na Verificação Inicial.");
        }
    }

    @Override
    public void setNextAprovador(Aprovador nextAprovador) {
        this.nextAprovador = nextAprovador;
    }
}
