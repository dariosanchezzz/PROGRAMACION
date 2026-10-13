import java.util.Scanner;

public class capicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número mayor que 0 y menor de 6 cifras: ");
       int numeroOriginal = scanner.nextInt();
       int numeroInvertido = 0;
       int numero = numeroOriginal;
       int ultimoDigito = numero % 10;
       if ( numeroOriginal >= 0 && numeroOriginal <= 99999) {
        while (numero > 0) {
            System.out.println("comprobamos si es capicua " );
            ultimoDigito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;
            numero = numero / 10;
        }
        if  (  numeroOriginal == numeroInvertido) {
        System.out.println("es capicua!");
    }  
        else {
    System.out.println("no es capicua");
    }

        }else {
    System.out.println("número de menos de 6 cifras no de más y que sea positivo");
}

        

    }
       
    }
