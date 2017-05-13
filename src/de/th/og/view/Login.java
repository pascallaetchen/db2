package de.th.og.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pasca on 09.05.2017.
 */
public class Login extends JFrame {

    private String password;

    private JPanel north, center, south;

    private JButton btnLogin;
    private JPasswordField pfPassword;
    private JComboBox <String> cmbUser;
    private JLabel lblUser, lblPassword;

    public void login () {
        north = new JPanel(new GridLayout(1,2,10,10));
        center = new JPanel(new GridLayout(1,2,10,10));
        south = new JPanel(new GridLayout(1,1,10,10));
        this.add(north, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);
        this.add(south, BorderLayout.SOUTH);

        lblUser = new JLabel("User:");
        cmbUser = new JComboBox<String>();
        north.add(lblUser);
        north.add(cmbUser);

        lblPassword = new JLabel("Password:");
        pfPassword = new JPasswordField();
        center.add(lblPassword);
        center.add(pfPassword);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TO-DO Vergleich Login-Daten
            }
        });
        south.add(btnLogin);

        super.setMinimumSize(new Dimension(600, 130));
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
