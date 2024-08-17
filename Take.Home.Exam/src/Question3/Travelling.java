/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ruten
 */
public class Travelling extends JFrame implements ActionListener {

    JFrame aFrame;
    JPanel aPanel;
    JButton submit;
    JComboBox sLocation;
    JComboBox eLocation;
    JComboBox travel;
    JTextField display;
    JLabel location;
    File file;
    String message;

    public static void main(String[] args) {
        Travelling work = new Travelling();
        work.myGui();

    }

    public void myGui() {
//JFrame       
        aFrame = new JFrame("Petrol Application");
        aFrame.pack();
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//JPanel
        aPanel = new JPanel();
        aPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

//JLabel1
        location = new JLabel("Start Location: ");
        location.setBounds(30, 20, 140, 25);
        aPanel.add(location);

//JLabel2
        location = new JLabel("End Location :");
        location.setBounds(30, 60, 140, 25);
        aPanel.add(location);

//JLabel3
        location = new JLabel("Travel By :");
        location.setBounds(30, 100, 100, 25);
        aPanel.add(location);
//JComboBox1
        String city[] = {"Cape Town", "Durban", "Port Elizabeth"};
        sLocation = new JComboBox(city);
        sLocation.setBounds(150, 20, 120, 30);
        sLocation.addActionListener(this);
        aPanel.add(sLocation);

//JComboBox2
        String places[] = {"Cape Town", "Durban", "Port Elizabeth"};
        eLocation = new JComboBox(places);
        eLocation.setBounds(150, 60, 120, 30);
        eLocation.addActionListener(this);
        aPanel.add(eLocation);

//JComboBox3
        String transport[] = {"Airplane", "Train"};
        travel = new JComboBox(transport);
        travel.setBounds(150, 100, 120, 30);
        travel.addActionListener(this);
        aPanel.add(travel);

//JButton object to Submit information
        submit = new JButton(new AbstractAction("SUBMIT") {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = "Travelers details\n"
                        + "Location departure " + sLocation.getSelectedItem() + "\n"
                        + "Location arrivale: " + eLocation.getSelectedItem() + "\n"
                        + "Mode of transportation: " + travel.getSelectedItem();
            }
        });

        try {
            BufferedWriter txt = new BufferedWriter(new FileWriter(".\\travel.txt"));
            txt.write("Travelers details\n"
                        + "Location departure " + sLocation.getSelectedItem() + "\n"
                        + "Location arrivale: " + eLocation.getSelectedItem() + "\n"
                        + "Mode of transportation: " + travel.getSelectedItem());
            txt.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        submit.setBounds(100, 150, 80, 25);
        aPanel.add(submit);
        submit.addActionListener(this);
//        try {
//            BufferedWriter txt = new BufferedWriter(new FileWriter(".\\travel.txt"));
//            txt.write(message);
//            txt.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            display = new JTextField(reader.readLine());
            reader.close();
        } catch (IOException ex) {

            ex.printStackTrace();
        }

//JTextField object to print out the details
//        display = new JTextField(message);
        display.setBounds(30, 190, 280, 100);
        aPanel.add(display);

//=========
        aPanel.setLayout(null);
        aFrame.add(aPanel);
        aFrame.setSize(350, 400);
        aFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sLocation || e.getSource() == eLocation) {
            int start = sLocation.getSelectedIndex();
            int end = eLocation.getSelectedIndex();

            if (start == 0 && end == 0) {
                JOptionPane.showMessageDialog(null, "Destinations cannot be the same!!!");
            } else if (start == 1 && end == 1) {
                JOptionPane.showMessageDialog(null, "Destinations cannot be the same!!!");
            } else if (start == 2 && end == 2) {
                JOptionPane.showMessageDialog(null, "Destinations cannot be the same!!!");
            }
        }
    }
}
