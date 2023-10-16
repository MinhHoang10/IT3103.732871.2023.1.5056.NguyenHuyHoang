//package OOP.Lab.01;
// Nguyen Huy Hoang 2021 - 5056
import javax.swing.JOptionPane;

public class showTwoNumbers {
    
    public static void main(String[] args){
        String strNum1,strNum2;
        String strNotification = "Nguyen Huy Hoang - 5056 - You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number : ", "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,"Please input second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification,"show two Numbers ",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
