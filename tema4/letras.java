public class letras {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int codigoLetra = (int) (Math.random() * 26) + 65;
            
         if (Math.random() > 0.5) {
                codigoLetra = codigoLetra + 32;
            } 
    
char letraFinal = (char) codigoLetra;
System.out.println("Caracter " + i + ": " + letraFinal);
            
            i++;
        }
    }
}
