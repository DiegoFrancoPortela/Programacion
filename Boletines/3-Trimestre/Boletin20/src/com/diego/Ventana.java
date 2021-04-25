package com.diego;

import javax.swing.*;
import java.awt.*;

public class Ventana {
    JFrame marco;
    JPanel panel;
    JPanel panel2;
    JButton bLimpar, bPremer, bBoton;
    JTextField lNome;
    JPasswordField lPass;
    JLabel etqNome,etqPass;
    JTextArea aTexto, alistaElementos, aTexto2;
    JSeparator Separador;

    public void crear() {
        marco = new JFrame("Marco");
        Separador = new JSeparator();
        //PANEL 1
        panel = new JPanel();
        bLimpar = new JButton("LIMPAR");
        bPremer = new JButton("PREMER");
        lNome = new JTextField();
        lPass = new JPasswordField();
        etqNome =  new JLabel("NOME");
        etqPass = new JLabel("CONTRASINAL");
        aTexto = new JTextArea("Area de Texto");
        //PANEL 2
        panel2 = new JPanel();
        alistaElementos = new JTextArea("ElementoLista1\nElementoLista2\nElementoLista3");
        bBoton = new JButton("BOTON");
        aTexto2 = new JTextArea("Area de Texto");

        marco.setSize(850,450);
        marco.setResizable(false);
        Separador.setBounds(450,200,10,300);
        //PANEL 1
        panel.setSize(400,400);
        panel.setLayout(null);
        bLimpar.setBounds(250,300,100,50);
        bPremer.setBounds(50,300,100,50);
        lNome.setBounds(250,50,120,30);
        lPass.setBounds(250,100,120,30);
        etqNome.setBounds(50,50,100,25);
        etqPass.setBounds(50,100,100,25);
        aTexto.setBounds(50,150,320,100);
        //PANEL 2
        panel2.setSize(400,400);
        panel2.setLayout(null);
        alistaElementos.setBounds(430,150,130,100);
        bBoton.setBounds(570,170,100,30);
        aTexto2.setBounds(680,150,130,100);

        //PANEL 1
        panel.add(bLimpar);
        panel.add(bPremer);
        panel.add(lNome);
        panel.add(lPass);
        panel.add(etqNome);
        panel.add(etqPass);
        panel.add(aTexto);
        panel.add(Separador);
        //PANEL 2
        panel2.add(alistaElementos);
        panel2.add(bBoton);
        panel2.add(aTexto2);

        // ---
        marco.add(panel);
        marco.add(panel2);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}