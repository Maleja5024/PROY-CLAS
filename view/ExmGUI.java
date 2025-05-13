package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExmGUI extends JFrame{

    /*
     * Para serializar objetos. Guardar al disco duro. 
     * 
     */
    private static final long serialVersionUID = 1L;

    //Membes Class
    private JTextField numField;
    private JLabel msgLabel;
    private JLabel numberText;
    private JButton buttonTry;

    //Constructor Method
    public ExmGUI() {

        //Properties of the window
        setTitle("Guess the Number");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 150);
        setLocationRelativeTo(null);//Center of the Screen

        numField = new JTextField(5);
        numberText = new JLabel("Number: ");
        msgLabel = new JLabel("\"                    Introduce a number between 1 and 1000:\"");
        buttonTry = new JButton("Try!");

        JPanel panelCentral = new JPanel();
        panelCentral.add(numberText);
        panelCentral.add(numField);

        //setLayout(new BorderLayout());

        add(msgLabel, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(buttonTry, BorderLayout.SOUTH);
    }
}