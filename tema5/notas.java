import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una nota (del 0 al 10): ");
        double nota = sc.nextDouble();
       
        while (nota < 0 || nota > 10) {
            System.out.println(" ¡Nota inválida! Tiene que estar entre 0 y 10.");
            System.out.print("Por favor, vuelve a introducir la nota: ");
            nota = sc.nextDouble(); 
        }
        
        
        if (nota >= 9) {
            System.out.println("Calificación: Sobresaliente");
        } 
        else if (nota >= 7) {
            System.out.println("Calificación: Notable");
        } 
        else if (nota == 6) {
            System.out.println("Calificación: Bien");
        } 
        else if (nota >= 5) {
            System.out.println("Calificación: Aprobado");
        } 
        else {
            System.out.println("Calificación: Suspenso");
        }
        
        sc.close();
    }
}