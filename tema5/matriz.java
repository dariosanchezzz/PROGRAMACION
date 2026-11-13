import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de columnas:");
        int filas = sc.nextInt();
         System.out.println("Introduce el número de columnas:");
        int columnas = sc.nextInt();

        for (int i = 1; filas >= i; i++) {
            
            for (int j = 1 ; j <= columnas; j++) {
                int resultado = i*j;
                System.out.print(resultado + " "); 
            }
            
            System.out.println(); 
        }
    }
}

