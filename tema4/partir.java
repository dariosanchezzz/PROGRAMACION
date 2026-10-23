import java.util.Scanner; 

public class partir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Introduce un número: ");
        String numero = sc.nextLine(); 

        System.out.print("Introduce la posición de corte: ");
        int posicion = sc.nextInt();
        
        String parte1 = numero.substring(0, posicion - 1); 
        String parte2 = numero.substring(posicion - 1); 
        System.out.println("Parte 1: " + parte1);
        System.out.println("Parte 2: " + parte2);
        
        sc.close();
    }
}