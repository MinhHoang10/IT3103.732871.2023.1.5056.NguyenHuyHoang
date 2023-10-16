//Nguyen Huy Hoang - 20215056

import javax.swing.JOptionPane;

public class calculate {
    public static void main(String[] args){
        String strnum1, strnum2;
        String strNotisum = " Sum of 2 number is : ";
        String strNotidif = " difference of 2 number is : ";
        String strNotipro = " product of 2 number is : ";
        String strNotiquo = " quotient of 2 number is : ";
        strnum1 = JOptionPane.showInputDialog(null, "Input the first number", "Input the first Number", JOptionPane.INFORMATION_MESSAGE);
        strnum2 = JOptionPane.showInputDialog(null, "Input the second number", "Input the second Number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strnum1);
        double num2 = Double.parseDouble(strnum2);
        strNotisum += num1 + num2;
        strNotidif += num1 - num2;
        strNotipro += num1 * num2;
        if ( num2 != 0) {
            strNotiquo += num1 / num2;
        } else {
            strNotiquo = " Cannot devide by zero";
        }
        JOptionPane.showMessageDialog(null, strNotisum, "strNum1+strNum2", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strNotidif, "strNum1-strNum2", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strNotipro, "strNum1*strNum2", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strNotiquo, "strNum1/strNum2", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
