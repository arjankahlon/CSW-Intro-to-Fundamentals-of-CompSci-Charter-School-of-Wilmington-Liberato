//Arjan Kahlon
//Period A
//4/8/19
//EvenNumbers

import javax.swing.JOptionPane;
public class EvenNumbers
{
    public static void main(String [] args) {
        System.out.println("Even Numbers");    
        int d1 = 0;
        String i = JOptionPane.showInputDialog("Type a positive number");
        int d2 = Integer.parseInt(i);
        while (d2 > d1){
            System.out.println(d1);
            d1++;
            d1++;

        }
        if (d1 == d2){
            System.out.println(d2);
            System.out.println("Done");
        }
        else if (d1<=0) {
            System.out.println("Not a positive number");
        }
    }
}