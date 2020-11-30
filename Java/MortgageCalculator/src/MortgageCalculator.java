import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.NumberFormat;

public class MortgageCalculator extends JFrame {
    private JPanel panel1;
    private JPanel mainPanel;
    private JButton calculateButton;
    private JTextField periodInput;
    private JTextField interestRateAnInput;
    private JTextField principalInput;
    private JLabel mortgageResultLabel;
    private JLabel principalErrorLabel;
    private JLabel interestRateErrorLabel;
    private JLabel periodErrorLabel;


    MortgageCalculator(String title){
        super (title);
        URL iconURL = getClass().getResource("TG-program-icon.png");// iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(400, 300));
        this.pack();
        this.setLocationRelativeTo(null);  // center the application on the screen
        final byte MONTHS_PER_YEAR = 12;
        final byte PERCENT =100;


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               boolean inputOkay  = true;
               int principal = Integer.parseInt(principalInput.getText());
               double annualInterestRate = Double.parseDouble(interestRateAnInput.getText());
               byte periodYears = Byte.parseByte(periodInput.getText());

               if (principal == 0) {
                   principalErrorLabel.setText(" X ");
                   principalErrorLabel.setForeground(Color.RED);
                   mortgageResultLabel.setText("Come on this is useless:)");
                   mortgageResultLabel.setForeground(Color.RED);
                   inputOkay  = false;
               }
               if(annualInterestRate <0){
                   interestRateErrorLabel.setText(" X ");
                   interestRateErrorLabel.setForeground(Color.RED);
                   mortgageResultLabel.setText("Invalid value");
                   mortgageResultLabel.setForeground(Color.RED);
                   inputOkay  = false;
               }
               if(periodYears <=0){
                   periodErrorLabel.setText(" X ");
                   periodErrorLabel.setForeground(Color.RED);
                   mortgageResultLabel.setText("Invalid value");
                   mortgageResultLabel.setForeground(Color.RED);
                   inputOkay  = false;

               }
               if(inputOkay) {
                   double monthlyInterestRate = annualInterestRate / MONTHS_PER_YEAR / PERCENT;
                   int amountMonthlyPayments = periodYears * MONTHS_PER_YEAR;

                   double devisionUP = principal * (monthlyInterestRate * (Math.pow(monthlyInterestRate + 1, amountMonthlyPayments)));
                   double devisionDown = Math.pow(monthlyInterestRate + 1, amountMonthlyPayments) - 1;
                   String result = NumberFormat.getCurrencyInstance().format((devisionUP / devisionDown));
                   principalErrorLabel.setText("");
                   interestRateErrorLabel.setText("");
                   periodErrorLabel.setText("");

                   mortgageResultLabel.setForeground(Color.BLACK);
                   mortgageResultLabel.setText(result);

               }
            }
        });

    }



    public static void main(String[] args) {

    JFrame mortgageCalculator = new MortgageCalculator("Mortgage Calculator");
    mortgageCalculator.setVisible(true);

    }
}
