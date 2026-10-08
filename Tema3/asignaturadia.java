import java.util.Scanner;

public class asignaturadia {
public static void main(String[] args) {
    String dia;
    Scanner sc = new Scanner(System.in);
    System.out.println("introduzca el día para ver que toca a primera hora");
    dia = sc.nextLine();
switch (dia) {
case "lunes":
    System.out.println("lenguaje de marca");
    break;

case "martes":
    System.out.println("base de datos");
    break;

case "miercoles":
    System.out.println("sistemas informáticos");
    break;

case "jueves":
    System.out.println("progrmación");
    break;

case "viernes":
    System.out.println("entorno de desarrollo");
    break;

        }
    }
}