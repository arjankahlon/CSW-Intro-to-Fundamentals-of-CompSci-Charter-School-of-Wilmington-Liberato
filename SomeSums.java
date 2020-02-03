//Arjan Kahlon
//Period A
//4/16/19
//SomeSums

import javax.swing.JOptionPane;
public class SomeSums{
    public static void main(String args []) {   
        String input = JOptionPane.showInputDialog("Type a positive number");
        int a = Integer.parseInt(input);
        int as = a;
        int a1 = a;
        int a2 = a;
        int b = 1;
        int c=1;
        int d=0;
        int a3=a;
        int e = 5;
        if (a%2 == 1){
            e = 1;
        }
        else if (a%2==0){
            e=0;
        }
        else{
            System.out.println("ERROR");
        }

        
        while (a1 > 1){
            b = a1+b;
            a1--;
        }
        System.out.println("The sum of all numbers from 0 to "+ as+" is "+b);
        while (a2 >1 ){
            c = a2+c;
            a2--;
            a2--;

        }
        
        if (e == 1){
            a--;
            a1--;
            a2--;
            a3--;
        }
        
        while (a3 >1 ){
            d = a3+d;
            a3--;
            a3--;

        }
        System.out.println("The sum of all even numbers from 0 to "+ as+" is "+d);

        System.out.println("The sum of all odd numbers from 0 to "+ as+" is "+c);
        
    }
}
