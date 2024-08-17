/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ruten
 */
public class operations extends JFrame implements ActionListener {

//JSwing Declarations 
    JFrame HospInspFrame;
    JPanel HospInspPanel;
    JMenuBar HospBar;
    JMenu MenuFile;
    JMenuItem HospExit;
    JMenu MenuTools;
    JMenuItem saveInfo;
    JMenuItem printInfo;
    JMenuItem clearInfo;
    JLabel HospName;
    JLabel HospLocation;
    JLabel HospInspection;
    JComboBox comboBox;
    JTextField HospNameText;
    JTextField HospLocText;
    JTextArea HospDetails;
    JButton SaveButton;
    JButton PrintButton;
    JButton ClearButton;

//Declaring an ArrayList
    int count = 2;
    static ArrayList<Storage> Information = new ArrayList<>();

//Method that adds the captured user input and stores it in an arraylist.
    public static void add(Storage store) 
    {
        Information.add(store);
    }

//Method that returns the captured user input in the arraylist.
    public ArrayList<Storage> getInformation() 
    {
        return Information;
    }

//Method that clears all the captured user input in the arraylist.

    public ArrayList<Storage> clear() 
    {
        this.Information.clear();
        return Information;
    }

    public void myGui() 
    {
//JFrame object for the Hospital Inspections frame      
        HospInspFrame = new JFrame("Hospital Inspections");
        HospInspFrame.pack();
        HospInspFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//JPanel object for the Hospital Inspections
        HospInspPanel = new JPanel();
        HospInspPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

//JMenuBar object
        HospBar = new JMenuBar();

//JMenu File object to initialise the close program selection
        MenuFile = new JMenu("File");
        HospExit = new JMenuItem("Close");
        HospExit.addActionListener(this);
        MenuFile.add(HospExit);
        HospBar.add(MenuFile);

//JMenu Tools for the bar
        MenuTools = new JMenu("Tools");
        saveInfo = new JMenuItem("Save");
        saveInfo.addActionListener(this);
        MenuTools.add(saveInfo);

        printInfo = new JMenuItem("Print");
        printInfo.addActionListener(this);
        MenuTools.add(printInfo);

        clearInfo = new JMenuItem("Clear");
        clearInfo.addActionListener(this);
        MenuTools.add(clearInfo);
        HospBar.add(MenuTools);

//JLabel object for Hospital name 
        HospName = new JLabel("Hospital Name: ");
        HospName.setBounds(30, 20, 150, 25);
        HospInspPanel.add(HospName);

//JLabel object for Hospital location 
        HospLocation = new JLabel("Hospital Location: ");
        HospLocation.setBounds(30, 60, 150, 25);
        HospInspPanel.add(HospLocation);

//JLabel object for Hospital Inspection 
        HospInspection = new JLabel("Years Since Inspection: ");
        HospInspection.setBounds(30, 100, 150, 25);
        HospInspPanel.add(HospInspection);

//JTextField object for the name
        HospNameText = new JTextField(20);
        HospNameText.setBounds(250, 20, 200, 30);
        HospInspPanel.add(HospNameText);

//JTextField object for the location
        HospLocText = new JTextField(20);
        HospLocText.setBounds(250, 60, 200, 30);
        HospInspPanel.add(HospLocText);

//JCobmoBox for Hosptial Inspection
        String year[] = {"1 Year", "2 Years", "3 Years", "4 Years", "5 Years"};
        comboBox = new JComboBox(year);
        comboBox.setBounds(250, 100, 200, 30);
        comboBox.addActionListener(this);
        HospInspPanel.add(comboBox);

//JButton object to save information
//            SaveButton = new JButton("SAVE");
//            SaveButton.setBounds(250, 140, 200, 30);
//            HospInspPanel.add(SaveButton);
//            SaveButton.addActionListener(this);

//JTextArea object to print out the details
        HospDetails = new JTextArea();
        HospDetails.setBounds(30, 180, 430, 100);
        HospInspPanel.add(HospDetails);

//JButton object to print information
        PrintButton = new JButton(new AbstractAction("PRINT") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = " ";
                for (int i = 0; i < Information.size(); i++) {

                    message = message + "Hospital Name: " + Information.get(i).getNameTextField() + "\n"
                            + "Hospital Location: " + Information.get(i).getLocationTextField() + "\n"
                            + "Years since Inspection: " + Information.get(i).getcBoxYears() + "\n"
                            + "****************\n";
                }
                HospDetails.setText(message);
            }
        });
        PrintButton.setBounds(30, 290, 200, 30);
        HospInspPanel.add(PrintButton);
        PrintButton.addActionListener(this);

//JButton object to save information
        SaveButton = new JButton(new AbstractAction("SAVE") {
            @Override
            public void actionPerformed(ActionEvent e) {
                Storage store = new Storage();

                // Adding button action inside here
                String nameTextField = HospNameText.getText();
                String locationTextField = HospLocText.getText();
                String cBoxYears = (String) comboBox.getSelectedItem();
                //Storing all the user data in the object
                store.setNameTextField(nameTextField);
                store.setLocationTextField(locationTextField);
                store.setcBoxYears(cBoxYears);
                Information.add(store);
            }

        });
        SaveButton.setBounds(250, 140, 200, 30);
        HospInspPanel.add(SaveButton);
        SaveButton.addActionListener(this);

//JButton object to clear information
        ClearButton = new JButton(new AbstractAction("CLEAR") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // add action 
                HospNameText.setText("");
                HospLocText.setText("");
                HospDetails.setText("");
                comboBox.setSelectedIndex(0);
                clear();
            }
        });
        ClearButton.setBounds(260, 290, 200, 30);
        HospInspPanel.add(ClearButton);
        ClearButton.addActionListener(this);

        //====
        HospInspPanel.setLayout(null);
        HospInspFrame.add(HospInspPanel);
        HospInspFrame.setSize(500, 400);
        HospInspFrame.setVisible(true);
        HospInspFrame.setJMenuBar(HospBar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clearInfo) {
            HospNameText.setText("");
            HospLocText.setText("");
            HospDetails.setText("");
            comboBox.setSelectedIndex(0);
        }
        if (e.getSource() == HospExit) {
            System.exit(0);
        }

        if (e.getSource() == saveInfo) {

            final Storage store = new Storage();

            // Adding button action inside here
            String nameTextField = HospNameText.getText();
            String locationTextField = HospLocText.getText();
            String cBoxYears = (String) comboBox.getSelectedItem();
            //Storing all the user data in the object
            store.setNameTextField(nameTextField);
            store.setLocationTextField(locationTextField);
            store.setcBoxYears(cBoxYears);
            Information.add(store);
        }
        if (e.getSource() == printInfo) {

            for (int i = 0; i < Information.size(); i++) {

                HospDetails.setText(
                        "Hospital Name: " + Information.get(i).getNameTextField() + "\n"
                        + "Hospital Location: " + Information.get(i).getLocationTextField() + "\n"
                        + "Years since Inspection: " + Information.get(i).getcBoxYears() + "\n"
                        + "****************");
            }
        }

    }

}
