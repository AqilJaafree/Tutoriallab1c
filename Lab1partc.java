import javax.swing.JOptionPane;

public class Lab1partc {
    // main method begins execution of Java application
    public static void main(String args[]) {

        // read in first number from user as a string
        String firstNum = JOptionPane.showInputDialog("Enter the number of call minutes");

        // convert number from type String to type int using wrapper class
        int num1 = Integer.parseInt(firstNum);
        double rateperunit = 0;

        // condition for phone bill
        if (num1 == 100) {
            rateperunit = num1 * 0.20;
        } else if (num1 > 100 && num1 <= 150) {
            rateperunit = num1 * 0.35;
        } else if (num1 > 150) {
            rateperunit = num1 * 0.15;
        } else {
            System.out.println("Error: Invalid input");
            System.exit(0);
        }

        // display result
        JOptionPane.showMessageDialog(null, "The total is: " + (rateperunit));
    }
} // end method main
