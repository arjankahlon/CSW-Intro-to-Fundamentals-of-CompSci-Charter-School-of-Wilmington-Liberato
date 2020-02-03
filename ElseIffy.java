//Arjan Kahlon
//Period A
//3/28/19
//ElseIffy
import javax.swing.JOptionPane;
public class ElseIffy
{
    public static void main(String [] args) {
        String a = JOptionPane.showInputDialog("Type an integer!");
        int b = Integer.parseInt(a);
        
        if (b > 10) {
            System.out.println("You typed a number greater than 10!");
        } else if (b < 0) {
            System.out.println("You typed a number less than zero!");
        } else {
            System.out.println("You typed a number from 0 to 10!");
        }
    }
}
