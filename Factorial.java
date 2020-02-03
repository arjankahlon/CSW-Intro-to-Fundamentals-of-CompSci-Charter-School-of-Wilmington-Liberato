//Arjan Kahlon
//Period A
//4/8/19
//Factorial

import javax.swing.JOptionPane;
public class Factorial{
    public static void main(String args []) {   
        String input = JOptionPane.showInputDialog("Type a positive number");
        int a = Integer.parseInt(input);
        int b = 1;
        System.out.print("The factorial of "+a+" is "+ a);
        while (a > 1){
            b = a*b;
            a--;
            System.out.print(" x "+ a);
            
        }
        System.out.println(" = "+b);

    }
}
