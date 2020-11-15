import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.Dimension;

public class MortgageCalculator extends JFrame {
    private JPanel panel1;
    private JPanel mainPanel;
    private JButton calculateButton;
    private JTextField periodInput;
    private JTextField interestRateAnInput;
    private JTextField principalInput;
    private JLabel mortgageResultLabel;


    MortgageCalculator(String title){
        super (title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(400, 300));
        this.pack();

        final byte MONTHS_PER_YEAR = 12;
        final byte PERCENT =100;


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               int principal = Integer.parseInt(principalInput.getText());
               double annualInterestRate = Double.parseDouble(interestRateAnInput.getText());
               byte periodYears = Byte.parseByte(periodInput.getText());

               double monthlyInterestRate = annualInterestRate / MONTHS_PER_YEAR / PERCENT;
               int amountMonthlyPayments = periodYears * MONTHS_PER_YEAR;

               double devisionUP = principal*(monthlyInterestRate*(Math.pow(monthlyInterestRate+1,amountMonthlyPayments)));
               double devisionDown = Math.pow(monthlyInterestRate+1 ,amountMonthlyPayments)-1;
               String result = NumberFormat.getCurrencyInstance().format((devisionUP /devisionDown)) ;

               mortgageResultLabel.setText(result);

            }
        });

    }



    public static void main(String[] args) {

    JFrame mortgageCalculator = new MortgageCalculator("Mortgage Calculator");
    mortgageCalculator.setVisible(true);

    }
}
