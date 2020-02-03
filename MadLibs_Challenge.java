//Arjan Kahlon 
//Period A
//3/26/19
//mad Libs

import javax.swing.JOptionPane;

public class MadLibs_Challenge{
    public static void main(String Args[]) {
        String a = JOptionPane.showInputDialog("Type a name");
        String b = JOptionPane.showInputDialog("Type a place");
        String c = JOptionPane.showInputDialog("Type a number");
        String d = JOptionPane.showInputDialog("Type an attraction");
        String e = JOptionPane.showInputDialog("Type a food");
        String f = JOptionPane.showInputDialog("Type a sport");
        String g = JOptionPane.showInputDialog("Type a toy");
        String h = JOptionPane.showInputDialog("Type a location");
     
        
        
        System.out.println("Today is "+ a +"'s birthday and he is going to " + b +" with " + c +" of his friends. When they get there they'll go to " + d + " , eat " + e +" , and play " + f + ". " + a +" got a " + g + " as a gift from his friends. " + a + " was very excited at the end of the day, so they all went to " + h + ".");     
  
    }
}