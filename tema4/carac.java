public class carac {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int caracter = (int) (Math.random() * 6);
            
            if (caracter == 0) {
                System.out.print("@");
            } 
            else if (caracter == 1) {
                System.out.print("*");
            }
            else if (caracter == 2) {
                System.out.print(".");
            }
            else if (caracter == 3) {
                System.out.print("-");
            }

            else if (caracter == 4) {
                System.out.print("=");
            }

            else if (caracter == 5) {
                System.out.print("|");
            }
            
            i++;
        }
    }
}