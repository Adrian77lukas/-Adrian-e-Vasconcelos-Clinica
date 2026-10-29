package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfacegrafica.JanelaPrincipal;
import interfacegrafica.JanelaConsulta;

public class Navegacao {

    public Navegacao(final JanelaPrincipal principal) {

        principal.getAbrirAgenda().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent evento) {

                    JanelaConsulta consulta = new JanelaConsulta();

                    new GestorConsulta(consulta);

                    consulta.setVisible(true);

                    principal.dispose();
                }
            }
        );
    }
}