public class EscaleraInversa {
    public static void main(String[] args) {
        
        int totalFilas = 4;
        
        // Bucle exterior: Controla las filas (del 1 al 4)
        for (int i = 1; i <= totalFilas; i++) {
            
            // 1. Bucle para los ESPACIOS de la izquierda
            // Cuanto más arriba estamos (i pequeño), más espacios necesitamos.
            for (int s = 1; s <= totalFilas - i; s++) {
                System.out.print(" ");
            }
            
            // 2. Bucle para los NÚMEROS (hacia atrás, desde i hasta 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // 3. Salto de línea al terminar cada fila
            System.out.println();
        }
        
    }
}