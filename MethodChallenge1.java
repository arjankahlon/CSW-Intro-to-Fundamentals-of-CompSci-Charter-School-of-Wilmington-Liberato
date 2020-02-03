import javax.swing.JOptionPane; 

public class MethodChallenge1 { 
    public static void main (String [] args) { 
        String s = JOptionPane.showInputDialog("Radius?"); 
        double r = Double.parseDouble(s); 
        double area = circArea(r); 
        System.out.println("The area of the circle is " + area); 
    }

    public static double circArea(double rad) 
    {
        return(Math.PI*rad*rad);
    }
}
