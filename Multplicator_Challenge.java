//Arjan Kahlon 
//Period A
//3/28/19
//multiplicator

import javax.swing.JOptionPane;

public class Multplicator_Challenge{
    public static void main(String Args[]) {
        String x = JOptionPane.showInputDialog("Type a number");
        double a = Double.parseDouble(x); 
        String y = JOptionPane.showInputDialog("Type another number");
        double b = Double.parseDouble(y); 
 
     
        
        
       System.out.println("Number 1 = " + x);  
       System.out.println("Number 2 = " + y);
       System.out.println("Answer = " + (a*b));
  
    }
}