import org.w3c.dom.Node;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Point {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel nombreLabel = new JLabel("Nombre");
        JTextField nombreText = new JTextField(15);

        JLabel edadlabel = new JLabel("Edad");
        JTextField edadText = new JTextField(5);

        JButton enviarBtn = new JButton("Enviar");

        JLabel resultado = new JLabel("");

        enviarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreText.getText();
                String edad = edadText.getText();
                resultado.setText("Hola " + nombre + ", tienes " + edad + " años.");
            }
        });
        panel.add(nombreLabel);
        panel.add(nombreText);
        panel.add(edadlabel);
        panel.add(edadText);
        panel.add(enviarBtn);
        panel.add(resultado);

        frame.add(panel);
        frame.setVisible(true);
    }
}

