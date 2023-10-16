//Nguyen Huy Hoang - 20215056
import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Nguyen Huy Hoang 5056 - Please enter your name");
        JOptionPane.showMessageDialog(null, "Toi la Nguyen Huy Hoang. Hi " + result + "!");
        System.exit(0);
    }
}
