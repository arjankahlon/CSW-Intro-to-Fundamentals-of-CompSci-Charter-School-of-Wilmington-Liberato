//Arjan Kahlon
//Period A
//4/8/19
//BetterCount

import javax.swing.JOptionPane;
public class BetterCount
{
    public static void main(String [] args) {   
        String i1 = JOptionPane.showInputDialog("Enter Start");
        int d1 = Integer.parseInt(i1);
        String i2 = JOptionPane.showInputDialog("Enter End");
        int d2 = Integer.parseInt(i2);
        if (d1<d2) {
            while (d1 < d2){
                System.out.println(d1);
                d1++;

            }
            System.out.println(d2);
        }
        if (d1>d2) {
            while (d1 > d2){
                System.out.println(d1);
                d1--;

            }
            System.out.println(d2);
        }
    }
}