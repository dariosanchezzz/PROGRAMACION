import java.util.Scanner;
public class mbakb {
    public static void main(String args[]) {
        int Mb;
        int Kb;
        System.out.println("Calculamos los Kb multiplicando la cantidad de Mb  por 1024");
        System.out.println("introduzca los Mb");
        Scanner sc = new Scanner(System.in);
        Mb = sc.nextInt();
        Kb = Mb * 1024;
        System.out.println("El total de Kb es " + Kb );
    }
}