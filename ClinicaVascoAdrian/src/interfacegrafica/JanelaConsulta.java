package interfacegrafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JanelaConsulta extends JFrame {

    private JTextField campoPaciente;
    private JTextField campoEspecialidade;

    private JButton confirmar;
    private JButton limpar;
    private JButton voltar;

    public JanelaConsulta() {

        setTitle("Agendamento de Consulta");
        setSize(560, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel(
            "Agendar consulta",
            JLabel.CENTER
        );

        titulo.setFont(new Font("Arial", Font.BOLD, 21));

        JPanel formulario = new JPanel(
            new GridLayout(2, 2, 10, 12)
        );

        formulario.add(new JLabel("Nome do paciente:"));

        campoPaciente = new JTextField();
        formulario.add(campoPaciente);

        formulario.add(new JLabel("Especialidade médica:"));

        campoEspecialidade = new JTextField();
        formulario.add(campoEspecialidade);

        confirmar = new JButton("Confirmar agendamento");
        limpar = new JButton("Limpar");
        voltar = new JButton("Voltar");

        JPanel painelBotoes = new JPanel(new FlowLayout());

        painelBotoes.add(confirmar);
        painelBotoes.add(limpar);
        painelBotoes.add(voltar);

        add(titulo, BorderLayout.NORTH);
        add(formulario, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }

    public JTextField getCampoPaciente() {
        return campoPaciente;
    }

    public JTextField getCampoEspecialidade() {
        return campoEspecialidade;
    }

    public JButton getConfirmar() {
        return confirmar;
    }

    public JButton getLimpar() {
        return limpar;
    }

    public JButton getVoltar() {
        return voltar;
    }
}