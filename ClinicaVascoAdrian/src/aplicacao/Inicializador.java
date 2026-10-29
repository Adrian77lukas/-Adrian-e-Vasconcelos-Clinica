package aplicacao;

import interfacegrafica.JanelaPrincipal;
import controle.Navegacao;

public class Inicializador {

    public static void main(String[] args) {

        JanelaPrincipal principal = new JanelaPrincipal();

        new Navegacao(principal);

        principal.setVisible(true);
    }
}