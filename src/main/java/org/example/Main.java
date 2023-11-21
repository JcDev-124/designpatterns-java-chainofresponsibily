package org.example;

import org.example.aprovadores.Aprovador;
import org.example.aprovadores.AprovadorFinanceiro;
import org.example.aprovadores.AprovadorGerente;
import org.example.aprovadores.VerificadorInicial;
import org.example.dominio.Despesa;

public class Main {
    public static void main(String[] args) {
        // Construir a cadeia
        Aprovador verificadorInicial = new VerificadorInicial();
        Aprovador aprovadorGerente = new AprovadorGerente();
        Aprovador aprovadorFinanceiro = new AprovadorFinanceiro();

        verificadorInicial.setNextAprovador(aprovadorGerente);
        aprovadorGerente.setNextAprovador(aprovadorFinanceiro);

        // Cliente inicia a solicitação
        Despesa despesa = new Despesa(900);
        verificadorInicial.aprovar(despesa);    }
}