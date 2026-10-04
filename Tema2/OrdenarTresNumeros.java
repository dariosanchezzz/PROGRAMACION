import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int primernúmero = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int segundonúmero = sc.nextInt();

        System.out.println("Introduce el tercer número:");
        int tercernúmero = sc.nextInt();

        System.out.println("\nEl orden de mayor a menor es:");

        if (primernúmero >= segundonúmero && segundonúmero >= tercernúmero) {
            System.out.println(primernúmero + ", " + segundonúmero + ", " + tercernúmero);
        } 
        else if (primernúmero >= tercernúmero && tercernúmero >= segundonúmero) {
            System.out.println(primernúmero + ", " + tercernúmero + ", " + segundonúmero);
        } 
        else if (segundonúmero >= primernúmero && primernúmero >= tercernúmero) {
            System.out.println(segundonúmero + ", " + primernúmero + ", " + tercernúmero);
        } 
        else if (segundonúmero >= tercernúmero && tercernúmero >= primernúmero) {
            System.out.println(segundonúmero + ", " + tercernúmero + ", " + primernúmero);
        } 
        else if (tercernúmero >= primernúmero && primernúmero >= segundonúmero) {
            System.out.println(tercernúmero + ", " + primernúmero + ", " + segundonúmero);
        }  
        else {
            System.out.println(tercernúmero + ", " + segundonúmero + ", " + primernúmero);
        }

        sc.close();
    }
}