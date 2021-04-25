package com.diego;

import javax.swing.*;

public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton bLimpar, bPremer;
    JTextField lNome;
    JPasswordField lPass;
    JLabel etqNome,etqPass;
    JTextArea aTexto;

    public void crear() {
        marco = new JFrame("Marco");
        panel = new JPanel();
        bLimpar = new JButton("LIMPAR");
        bPremer = new JButton("PREMER");
        lNome = new JTextField();
        lPass = new JPasswordField();
        etqNome =  new JLabel("NOME");
        etqPass = new JLabel("CONTRASINAL");
        aTexto = new JTextArea("Area de Texto");

        marco.setSize(600,600);
        panel.setSize(550,550);
        panel.setLayout(null);
        bLimpar.setBounds(350,450,100,50);
        bPremer.setBounds(150,450,100,50);
        lNome.setBounds(350,100,120,30);
        lPass.setBounds(350,200,120,30);
        etqNome.setBounds(150,100,100,25);
        etqPass.setBounds(150,200,100,25);
        aTexto.setBounds(150,300,320,100);

        panel.add(bLimpar);
        panel.add(bPremer);
        panel.add(lNome);
        panel.add(lPass);
        panel.add(etqNome);
        panel.add(etqPass);
        panel.add(aTexto);

        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}