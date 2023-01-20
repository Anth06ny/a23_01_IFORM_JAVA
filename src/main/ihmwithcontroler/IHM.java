package main.ihmwithcontroler;

import main.beans.PartyBean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IHM extends JPanel implements ActionListener {

    private Controler controler;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jeu de dés");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new IHM());
        frame.pack();
        frame.setVisible(true);
    }


    // Composants graphiques
    private JTextField jtfScoreP1;
    private JTextField jtfD1;
    private JTextField jtfD2;
    private JTextField jtfScoreP2;
    private JButton jbRollP1;
    private JLabel jlTourNumber;
    private JButton jbRollP2;
    private JButton jbRestart;
    private JLabel lblD1;
    private JLabel lblD2;
    private JLabel jlP1;
    private JLabel jlP2;
    private JLabel labelScoreP2;
    private JLabel lblScoreJ1;
    private JLabel lblTour;
    private JLabel jlMessage;
    private JCheckBox jcbP1, jcbP2;

    /**
     * Create the application.
     */
    public IHM() {

        //construct components
        jlP1 = new JLabel("Joueur 1");

        jlP2 = new JLabel("Joueur 2");

        lblD1 = new JLabel("DE 1");

        lblD2 = new JLabel("DE 2");

        lblScoreJ1 = new JLabel("Score");

        jtfScoreP1 = new JTextField();

        jtfD1 = new JTextField();

        jtfD2 = new JTextField();

        jtfScoreP2 = new JTextField();

        labelScoreP2 = new JLabel("Score : ");

        lblTour = new JLabel("Tour : ");

        jlTourNumber = new JLabel("0");

        jbRollP1 = new JButton("Lancer");
        jbRollP2 = new JButton("Lancer");
        jbRestart = new JButton("Restart");
        jcbP1 = new JCheckBox("Tricheur");
        jcbP2 = new JCheckBox("Tricheur");
        jlMessage = new JLabel("Le joueur 1 a gagn\u00E9");

        //adjust size and set layout
        setPreferredSize(new Dimension(682, 403));
        setLayout(null);

        //add components
        add(jlP1);
        add(jlP2);
        add(lblD1);
        add(lblD2);
        add(lblScoreJ1);
        add(jtfScoreP1);
        add(jtfD1);
        add(jtfD2);
        add(labelScoreP2);
        add(jtfScoreP2);
        add(lblTour);
        add(jlTourNumber);
        add(jbRollP1);
        add(jbRollP2);
        add(jbRestart);
        add(jcbP1);
        add(jcbP2);
        add(jlMessage);

        //set component bounds (only needed by Absolute Positioning)
        jlP1.setBounds(39, 45, 82, 18);
        jlP2.setBounds(500, 45, 108, 18);
        lblD1.setBounds(235, 123, 46, 14);
        lblD2.setBounds(315, 123, 46, 14);
        lblScoreJ1.setBounds(33, 93, 57, 23);
        jtfScoreP1.setBounds(86, 96, 35, 20);
        jtfD1.setBounds(211, 148, 70, 64);
        jtfD2.setBounds(304, 148, 70, 64);
        labelScoreP2.setBounds(479, 93, 57, 23);
        jtfScoreP2.setBounds(532, 96, 35, 20);
        lblTour.setBounds(247, 36, 67, 27);
        jlTourNumber.setBounds(324, 36, 37, 27);
        jbRollP1.setBounds(33, 169, 89, 23);
        jbRollP2.setBounds(479, 169, 89, 23);
        jbRestart.setBounds(221, 290, 140, 23);
        jcbP1.setBounds(24, 119, 97, 23);
        jcbP2.setBounds(470, 119, 97, 23);
        jlMessage.setBounds(0, 251, 586, 14);


        jbRollP1.addActionListener(this);
        jbRollP2.addActionListener(this);

        jbRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controler.clickOnRestart();
            }
        });

        //Initialisation des composants
        controler = new Controler(this);
    }

    /**
     * Launch the application.
     */


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbRollP1) {
            controler.clickOnRollJ1();

        } else if (e.getSource() == jbRollP2) {
            controler.clickOnRollJ2();
        }
    }

    public void updateInfoJ1(String name, int score){
        jlP1.setText(name);
        jtfScoreP1.setText(score + "");
    }

    public void updateInfoJ2(String name, int score){
        jlP1.setText(name);
        jtfScoreP1.setText(score + "");
    }

    public void updateTourNumber(int tour){
        jlTourNumber.setText(tour + "");
    }

    public void updateVisiblityBt(boolean btRollJ1, boolean btRollJ2, boolean btRestart){
        jbRestart.setVisible(btRestart);
        jbRollP1.setVisible(btRollJ1);
        jbRollP2.setVisible(btRollJ2);
    }

    public void updateDiceValue(int d1, int d2){
        jtfD1.setText(d1 + "");
        jtfD2.setText(d2 + "");
    }

}