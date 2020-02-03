//Arjan Kahlon 
//Period A
//4/30/19
//MagicNumber
import java.util.Scanner;
public class MagicNumbers {
    public static void main(String[]args) {
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