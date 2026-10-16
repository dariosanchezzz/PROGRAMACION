import java.util.Scanner;

public class operacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int x = 0;
    double fx;
    System.out.println("resolveremos la siguiente operación ");
fx = (Math.sqrt(Math.sin(Math.pow(x,3)+ ((2*x) / 9))) + Math.cos(6*Math.PI + Math.tan(Math.pow(Math.E, Math.pow(x,3)))));
 
   System.out.println( "el resultado es igual a " + fx);
     
   scanner.close();
    }
}