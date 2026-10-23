import java.util.Scanner;

public class insertarencadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion;
        String digito;
        String parte1;
        String parte2;
        String resultado;
        String numero;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = sc.nextLine();
        
        System.out.print("Introduzca la posición donde quiere insertar: ");
        posicion = sc.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        digito = sc.next();
        parte1 = numero.substring(0, posicion - 1);
        parte2 = numero.substring(posicion - 1);
        
        resultado = parte1 + digito + parte2;
        
        System.out.println("El número resultante es " + resultado);
        
        sc.close();
    }
}