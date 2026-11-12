import java.util.Scanner;

public class Espar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
System.out.println("Introduce un número:");
int numero = sc.nextInt(); 
          for (int i = 2; i <= numero; i++) {
                       
        boolean esPar = true; 

                if (i % 2.0 != 0) {

                    esPar = false;
                }
                    if (esPar) {
                System.out.println(i);
                }
            }
        }
}


