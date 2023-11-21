package org.example.aprovadores;

// Interface manipuladora

import org.example.dominio.Despesa;

public interface Aprovador {
    void aprovar(Despesa despesa);
    void setNextAprovador(Aprovador nextAprovador);

}
