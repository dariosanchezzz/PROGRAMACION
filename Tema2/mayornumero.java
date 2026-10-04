import java.util.Scanner;

public class mayornumero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int primernúmero = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int segundonúmero = sc.nextInt();
        
        if (primernúmero > segundonúmero) {
            System.out.println("el primer número es mayor");
            } else if (segundonúmero > primernúmero) {
    System.out.println("El segundo número es mayor");
        } else {
            System.out.println("el primer y segundo número son iguales");
        }
        
        sc.close();
    }
}