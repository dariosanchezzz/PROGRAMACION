import java.util.Scanner;

public class buenas {

public void main(String arg[]) {
    int hora;  
    Scanner sc = new Scanner(System.in);
System.out.println("introduzca la hora del día");
    hora = sc.nextInt();

  if ( hora >=6 && hora <= 12) {
            System.out.println("Buenos días");
        } 
  else if (hora >=13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } 
  else if (hora >=21 && hora <= 24) {
            System.out.println("Buenas noches");
  }
   else if (hora >=0 && hora <= 5) {
            System.out.println("Buenas noches");
   }
    else {
         System.out.println( " introduzca una hora dentro de el rango del reloj");
        } 
    }
}