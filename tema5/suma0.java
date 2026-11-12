import java.util.Scanner;

public class suma0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumatotal = 0;

                            System.out.println( "Introduce todos los números que quieras sumar (el 0 es para cerrar).");

        while (true) {
            int numero = sc.nextInt();
            if (numero == 0) {

                break;
            } else {
                sumatotal = sumatotal + numero;
            }
            System.out.println( "El resultado es igual a " + sumatotal);
        }
    }
}