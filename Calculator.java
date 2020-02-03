//Arjan Kahlon
//Period A
//4/2/19
//ConditionProgram_3

import javax.swing.JOptionPane;
public class Calculator
{
    public static void main(String [] args) {
        String o = JOptionPane.showInputDialog("Type the symbol of the operation would you like to perform (+  -  *  /  %).");
        if (o.equals("+")) {
            String n1 = JOptionPane.showInputDialog("Type a number");
            double a = Double.parseDouble(n1);
            String n2 = JOptionPane.showInputDialog("Type another number");
            double b = Double.parseDouble(n2);
            System.out.println(a + " + " +b +" = "+ (a+b));

        }
         else if (o.equals("-")) {
            String n1 = JOptionPane.showInputDialog("Type a number");
            double a = Double.parseDouble(n1);
            String n2 = JOptionPane.showInputDialog("Type another number");
            double b = Double.parseDouble(n2);
            System.out.println(a + " - " +b +" = "+ (a-b));

        }
        else if (o.equals("*")) {
            String n1 = JOptionPane.showInputDialog("Type a number");
            double a = Double.parseDouble(n1);
            String n2 = JOptionPane.showInputDialog("Type another number");
            double b = Double.parseDouble(n2);
            System.out.println(a + " * " +b +" = "+ (a*b));

        }
        else if (o.equals("/")) {
            String n1 = JOptionPane.showInputDialog("Type a number");
            double a = Double.parseDouble(n1);
            String n2 = JOptionPane.showInputDialog("Type another number");
            double b = Double.parseDouble(n2);
            System.out.println(a + " / " +b +" = "+ (a/b));

        }
        else if (o.equals("%")) {
            String n1 = JOptionPane.showInputDialog("Type a number");
            int a = Integer.parseInt(n1);
            String n2 = JOptionPane.showInputDialog("Type another number");
            int b = Integer.parseInt(n2);
            System.out.println(a + " % " +b +" = "+ (a%b));

        }
            else {
            System.out.println("Error: Operation not found");
        }
    }
}
