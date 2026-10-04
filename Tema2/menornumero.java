import java.util.Scanner;

public class menornumero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int primernúmero = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int segundonúmero = sc.nextInt();

         System.out.println("Introduce el tercer número:");
        int tercernúmero = sc.nextInt();
        if (primernúmero <= segundonúmero && primernúmero <= tercernúmero) {
    System.out.println("El menor es el primero");
} else if (segundonúmero <= primernúmero && segundonúmero <= tercernúmero) {
    System.out.println("El menor es el segundo");
} else {
    System.out.println("El menor es el tercero");
}
        sc.close();
    }
}