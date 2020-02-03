import javax.swing.JOptionPane; 
import java.util.Scanner;
public class MethodChallenge2 { 
    public static void main (String [] args) { 
        String s = JOptionPane.showInputDialog("1. Calculator "+
                "2. The Count "+
                "3. Magic Number "+
                "4. Exit"); 
        double r = Double.parseDouble(s); 
        if (r==1){
            Calculator();
        }
        if (r==2){
            Count();
        }
        if (r==3){
            MagicNumber();
        }
        if (r==4){
            System.out.println("Bye");
        }
    }    
    public static void Calculator() {
        {
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

    public static void Count()  { 
        {
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
    public static void MagicNumber() {
        int b =(int)(Math.random() * 10 + 1);
        System.out.println("Guess the magic number from 1-10");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (!(a==b)){
            System.out.println("Nope, wrong number.  Try again.");
            a = sc.nextInt();
        }
        if (a == b){
            System.out.println("Yes, you guessed the magic number!");
        }

    }
}

