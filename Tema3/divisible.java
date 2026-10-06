import java.util.Scanner;
public class divisible {
public void main(String arg[]) {
    int numero;
    int resultado;
    Scanner sc = new Scanner(System.in);
    System.out.println("introduzca el número");
    numero = sc.nextInt();
    resultado = numero % 2;
    if (numero % 2 == 0 && numero % 3 == 0) {
        System.out.println(numero + " es divisible entre 2 y 3");
    }
    else if ((numero % 2 == 0) ^ (numero % 3 == 0)) {
    System.out.println(numero + " es divisible entre 2 o entre 3, pero no por ambos");
    }
    
    else if (numero % 2 == 0 || numero % 3 == 0) {
    System.out.println(numero + " es divisible entre 2 o entre 3");
    }
    else {
    System.out.println(numero + " no es divisible ni por 2 ni por 3");

    }
    
        }
     }

