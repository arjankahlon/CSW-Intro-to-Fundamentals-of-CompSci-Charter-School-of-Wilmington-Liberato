import java.util.Scanner;

public class MethodChallenge3 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a one-digit integer");
        int a = scan.nextInt();
        System.out.println(getNumberWord(a)); 
    }

    public static String getNumberWord(int a){
        {
            if (a == 1){
                return("one");
            }if (a == 2){
                return("two");
            }if (a == 3){
                return("three");
            }if (a == 4){
                return("four");
            }if (a == 5){
                return("five");
            }if (a == 6){
                return("six");
            }if (a == 7){
                return("seven");
            }if (a == 8){
                return("eight");
            }if (a == 9){
                return("nine");
            }
        }
        return("test");
    }
}