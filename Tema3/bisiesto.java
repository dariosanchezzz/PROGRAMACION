import java.util.Scanner;
public class bisiesto {
public void main(String arg[]) {
    int año;
    Scanner sc = new Scanner(System.in);
    System.out.println("introduzca el número del año");
    año = sc.nextInt();
    if (año % 400 == 0) {
        System.out.println(año + " es un año bisiesto");
    }
    else if (año % 100 == 0) {
    System.out.println(año + " no es un año bisiesto");
    }
    else if (año % 4 == 0) {
    System.out.println(año + " es un es un año bisiesto");
    }
    else {
    System.out.println(año + " no es es un año bisiesto");

    }
    
        }
     }