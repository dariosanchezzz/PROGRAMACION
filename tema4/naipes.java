import java.util.Scanner;

public class naipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int palo = (int) (Math.random() * 4) + 1; 
    int valor = (int) (Math.random()* 13) + 1; 
 System.out.println("Este programa va a elegir un número aleatorio de la baraja francesa:");
if ( valor == 1){
       System.out.print("As");
}
else if ( valor == 2 )  {
        System.out.print("2");
    }
    else if ( valor == 3 )  {
        System.out.print("3");
    }

    else if ( valor == 4 )  {
        System.out.print("4");
    }

    else if ( valor == 5 )  {
        System.out.print("5");
    }

    else if ( valor == 6 )  {
        System.out.print("6");
    }

    else if ( valor == 7 )  {
        System.out.print("7");
    }

    else if ( valor == 8 )  {
        System.out.print("8");
    }

    else if ( valor == 9 )  {
        System.out.print("9");
    }

    else if ( valor == 10 )  {
        System.out.print("10");
    }

    else if ( valor == 11 )  {
        System.out.print("J");
    }

    else if ( valor == 12 )  {
        System.out.print("Reina");
    }
   else {
    System.out.print("Rey");
   }
    
System.out.print(" de ");
    

if ( palo == 1 ) {
        System.out.println(" picas");
}
else if (palo == 2 ) {
    System.out.println(" corazones");
}
else if (palo == 3 ) {
    System.out.println(" tréboles");
}
else {
    System.out.println(" diamantes");
    
}

   scanner.close();
    }
}

