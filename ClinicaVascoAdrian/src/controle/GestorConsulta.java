package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import interfacegrafica.JanelaConsulta;
import interfacegrafica.JanelaPrincipal;

public class GestorConsulta {

    private JanelaConsulta janela;

    public GestorConsulta(final JanelaConsulta janela) {

        this.janela = janela;

        janela.getConfirmar().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent evento) {
                    confirmarAgendamento();
                }
            }
        );

        janela.getLimpar().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent evento) {
                    limparCampos();
                }
            }
        );

        janela.getVoltar().addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent evento) {

                    JanelaPrincipal principal = new JanelaPrincipal();

                    new Navegacao(principal);

                    principal.setVisible(true);

                    janela.dispose();
                }
            }
        );
    }

    private void confirmarAgendamento() {

        String paciente = janela.getCampoPaciente()
            .getText().trim();

        String especialidade = janela.getCampoEspecialidade()
            .getText().trim();

        if (paciente.length() == 0 ||
            especialidade.length() == 0) {

            JOptionPane.showMessageDialog(
                janela,
                "Preencha o nome do paciente e a especialidade.",
                "Campos obrigatórios",
                JOptionPane.WARNING_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                janela,
                "Agendamento confirmado!\n\n" +
                "Paciente: " + paciente + "\n" +
                "Especialidade: " + especialidade,
                "Confirmação",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    private void limparCampos() {

        janela.getCampoPaciente().setText("");
        janela.getCampoEspecialidade().setText("");

        janela.getCampoPaciente().requestFocusInWindow();
    }
}