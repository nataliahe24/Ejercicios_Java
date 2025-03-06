import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input= scanner.nextLine();
     int resultado = contarPalabras(input);
        System.out.println("Cantidad de palabras es:" + resultado);

    }
       static int contarPalabras(String palabras) {
               if (palabras.trim().isEmpty()) { // Verifica si la cadena está vacía
                   return 0;
               }
        
               String[] oracion = palabras.trim().split("\\s+"); // Divide por espacios
               return oracion.length; // Devuelve la cantidad de palabras
           }
       }





