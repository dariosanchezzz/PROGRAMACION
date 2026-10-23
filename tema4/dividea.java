import java.util.Scanner;

public class dividea {
    public static void main(String[] args) {
        String palabra;
        int mitad;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte una palabra: ");
        palabra = sc.nextLine();
        
        mitad = palabra.indexOf("a");
        
        if (mitad == -1) {
            mitad = palabra.indexOf("A");
        }
        
        if (mitad == -1) {
            System.out.println("Error, la palabra no contiene la letra a");
        } else {
            System.out.println("La palabra queda como: " + palabra.substring(0, mitad) + " " + palabra.substring(mitad));
        } 
        
        sc.close();
    }
}