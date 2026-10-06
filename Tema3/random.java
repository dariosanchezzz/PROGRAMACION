import java.util.Scanner;
public class random {
public static void main(String[] arg) {
    int numero1 = (int) (Math.random() * 10);
    int numero2 = (int) (Math.random() * 10);
    int resultadoreal;
    Scanner sc = new Scanner(System.in);
    System.out.println("los numeros elegidos son:" + numero1 + " y " + numero2);
    resultadoreal = numero1 + numero2;
      System.out.println("cuál es el resultado de " +numero1 + " y " + numero2 + " ?");
      int respuestaUsuario = sc.nextInt();
    if (respuestaUsuario == resultadoreal) {
        System.out.println("¡Correcto! la respuesta es " + resultadoreal + " (;");
    }
    else {
        System.out.println("incorrecto ): la respuesta es " + resultadoreal);
    }
        }
     }