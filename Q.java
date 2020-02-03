public class Q {
    public static void blerg(int x) {
        if (x == 5) return;
        System.out.println(x);
        blerg(x + 1);
    }
    
    public static void main(String [] args) {
        blerg(2);
    }
}