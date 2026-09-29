import java.util.Scanner;

public class calculavolumen {
    public void main(String arg[]) {
        double volumen;
        double altura; 
        double radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculamos el volumen dado el número pi multiplicado por altura, el cuadrado del radio y 1/3");
        System.out.println("introduzca la altura");
        altura = sc.nextDouble();
        System.out.println("introduzca el radio");
        radio = sc.nextDouble();
        volumen = radio*radio*0.33*altura*3.14159;
        System.out.println("El volumen es " + volumen);
    }
}
