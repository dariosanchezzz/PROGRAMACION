import java.util.Scanner;

public class insertar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion;
        String digito;
        String parte1;
        String parte2;
        String resultado;
        String numero;
        int mitad;
        int longitudcadena;
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = sc.nextLine();
        longitudcadena = numero.length();
        mitad = numero.length() / 2;
        System.out.print(" la cadena tiene una longitud de " + longitudcadena + ", así que insertamos <> en la posición " + mitad + " ya que es el medio. ");

        parte1 = numero.substring(0, mitad);
        parte2 = numero.substring(mitad);
        
        resultado = parte1 + "<>" + parte2;
        
        System.out.println("El número resultante es " + resultado);
        
        sc.close();
    }
}