package interfacegrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JanelaPrincipal extends JFrame {

    private JButton abrirAgenda;

    public JanelaPrincipal() {

        setTitle("Clinica Vida Plena");
        setSize(480, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel(
            "Clinica Vida Plena",
            SwingConstants.CENTER
        );

        titulo.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel mensagem = new JLabel(
            "<html><center>Bem-vindo(a)!<br>" +
            "Agende sua consulta conosco.</center></html>",
            SwingConstants.CENTER
        );

        abrirAgenda = new JButton("Agendar consulta");

        JPanel painelBotao = new JPanel(
            new FlowLayout(FlowLayout.CENTER)
        );

        painelBotao.add(abrirAgenda);

        add(titulo, BorderLayout.NORTH);
        add(mensagem, BorderLayout.CENTER);
        add(painelBotao, BorderLayout.SOUTH);
    }

    public JButton getAbrirAgenda() {
        return abrirAgenda;
    }
}