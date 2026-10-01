import java.util.Scanner;
public class kbamb {
    public static void main(String args[]) {
        int Mb;
        int Kb;
        System.out.println("Calculamos los Mb dividiendo la cantidad de Kb  por 1024");
        System.out.println("introduzca los Kb");
        Scanner sc = new Scanner(System.in);
        Kb = sc.nextInt();
        Mb = Kb / 1024;
        System.out.println("El total de Mb es " + Mb );
    }
}