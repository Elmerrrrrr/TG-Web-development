import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FahrenheitConverter extends JFrame  {

    private JTextField inputField;
    private JButton convertButton;
    private JComboBox selectionCelFahr;
    private JLabel answerLabel;
    private JPanel mainPanel;

    public FahrenheitConverter(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(400, 200));
        this.pack();


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String selection = String.valueOf(selectionCelFahr.getSelectedItem());

                if (selection == "Fahrenheit"){
                    double tempCelsius = (double) ((Double.parseDouble(inputField.getText())) / 1.8 + 32);
                    answerLabel.setText(Math.round(tempCelsius*10)/10 + " Celsius");

                }else {
                    double tempFahr = (double) ((Double.parseDouble(inputField.getText())) * 1.8 + 32);
                    answerLabel.setText((Math.round(tempFahr*10)/10) + " Fahrenheit");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new FahrenheitConverter("Celsius Converter");
        frame.setVisible(true);

    }
}

