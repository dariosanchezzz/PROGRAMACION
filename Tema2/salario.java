import java.util.Scanner;
public class salario {
    public static void main(String args[]) {
        int horas;
        int precioHora = 12;
        int salario;
        System.out.println("Calculamos el salario multiplicando la cantidad de horas trabajadas por 12 euros");
        System.out.println("introduzca las horas");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();
        salario = horas * precioHora;
        System.out.println("El salario semanal es de: " + salario + " euros");
    }
}
