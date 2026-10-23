import java.util.Scanner;

public class aprobado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

double nota1;
double nota2;
double notafinal;
double notarecuperacion;

System.out.println("Introduzca la nota del primer examen: ");

nota1 = scanner.nextDouble();

if ( nota1> 10 || nota1< 0 ){
       System.out.print("un número entre el 0 y el 10 por favor vuelva a empezar iniciando el programa de nuevo");
}
else {
        System.out.print("Ok gracias,");
    }

System.out.println(" Introduzca la nota del segundo examen: ");

nota2 = scanner.nextDouble();

if ( nota2> 10 || nota2< 0 ){
       System.out.print("un número entre el 0 y el 10 por favor");
}
else {
        System.out.print("Ok gracias, ");
    }

notafinal = (nota1 + nota2) / 2;

if ( nota1 >= 5 ){
       System.out.print("estás aprobado, tienes un " + notafinal);
}
else {
        System.out.print("estás suspenso, tienes un " + notafinal);
    }


if ( notafinal < 5 ){
       System.out.println(" vas a recuperación");
}
else {
        System.out.print(" enhorabuena!");
    }
    

    System.out.print("Introduzca el resultado de la recuperación: ");
notarecuperacion = scanner.nextDouble();

if ( notarecuperacion> 10 || notarecuperacion< 0 ){
       System.out.print("un número entre el 0 y el 10 por favor");
}
else {
        System.out.print("Ok gracias, ");
}
if ( notarecuperacion >= 5 ){
       System.out.print("Estas aprobado! tu nota es un 5");
}
else {
        System.out.print("Estas suspenso ): tu nota es un " + notafinal);
    }



    }
}