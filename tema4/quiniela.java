import java.util.Scanner;

public class aprobado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int p = 1; 

while (p <= 15) {
    double aleatorio = Math.random();
    
    System.out.print("Partido " + p + ": ");
    
    if (aleatorio < 0.5) {
        System.out.println("1");
    } else if (aleatorio < 0.8) {
        System.out.println("X");
    } else {
        System.out.println("2");
    }

    p++;
    
}
    }
}
