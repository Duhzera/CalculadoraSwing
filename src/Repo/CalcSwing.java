package Repo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcSwing extends JFrame{
    public void calculadora(){

        JFrame frame = new JFrame();
        frame.setTitle("Calc");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setLayout(new GridLayout(2,1));


        JPanel visor = new JPanel();
        JLabel txVisor = new JLabel();
        visor.add(txVisor);


        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnSoma = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnDiv = new JButton("/");
        JButton btnMult = new JButton("*");
        JButton btnResult = new JButton("=");
        JButton btnClear = new JButton("C");

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "4");
            }
        });btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "5");
            }
        });btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "8");
            }
        });btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txVisor.setText(txVisor.getText() + "9");
            }
        });


        JPanel teclas = new JPanel();
        teclas.setLayout(new GridLayout(4,4));


        teclas.add(btn7);
        teclas.add(btn8);
        teclas.add(btn9);
        teclas.add(btnSoma);
        teclas.add(btn4);
        teclas.add(btn5);
        teclas.add(btn6);
        teclas.add(btnSub);
        teclas.add(btn1);
        teclas.add(btn2);
        teclas.add(btn3);
        teclas.add(btnMult);
        teclas.add(btnDiv);
        teclas.add(btn0);
        teclas.add(btnResult);
        teclas.add(btnClear);

        frame.add(visor);
        frame.add(teclas);
        frame.setVisible(true);

    }

}
