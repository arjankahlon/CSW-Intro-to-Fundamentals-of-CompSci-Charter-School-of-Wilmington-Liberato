//Arjan Kahlon
//Period A
//3/28/19
//iffy
import javax.swing.JOptionPane;

public class Iffy
{
    public static void main(String [] args) {
        String a = JOptionPane.showInputDialog("Type an integer!");
        int b = Integer.parseInt(a);
        
        if (b > 10) {
            System.out.println("You typed a number greater than 10!");
        } else {
            System.out.println("You didn't type a number greater than 10");
        }
    }
}
