package com.claudino;

import javax.swing.*;
import java.awt.*;

public class JanelaBotoes extends JFrame {
    private static final long serialVersionUID = 3554620347134816488L;

    public JanelaBotoes(){
        super();
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JButton botão1 = new JButton("Cadastrar");
        contentPane.add(botão1, BorderLayout.WEST);

        JButton botão2 = new JButton("Corrigir");
        contentPane.add(botão2, BorderLayout.CENTER);

        JButton botão3 = new JButton("Excluir");
        contentPane.add(botão3, BorderLayout.EAST);

        setVisible(true);
    }
}
