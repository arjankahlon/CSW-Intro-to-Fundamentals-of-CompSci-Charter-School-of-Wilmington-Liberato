//Arjan Kahlon
//Period A
//4/2/19
//ConditionProgram_2
import javax.swing.JOptionPane;
public class ConditionProgram_2
{
    public static void main(String [] args) {
        
        String test = JOptionPane.showInputDialog("Type an word!");
             if (test.equals("Surprise!"))   {
            System.out.println("Success");
        } else if (test.equals("surprise!"))   {
            System.out.println("success");
        } else {
            System.out.println("failure");
    }
}
}
