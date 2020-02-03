//Arjan Kahlon
//Period A
//4/2/19
//ConditionProgram_1
import javax.swing.JOptionPane;
public class ConditionProgram_1
{
    public static void main(String [] args) {
        String a = JOptionPane.showInputDialog("Type an integer!");
        int b = Integer.parseInt(a);
        
        if (b >= 20) {
            System.out.println("You typed a number greater than or equal to 20!");
        } else if (b <= 10) {
            System.out.println("You typed a number less than or equal to 10!");
        } else {
            System.out.println("You typed a number between 10 and 20!");
        }
    }
}
