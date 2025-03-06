import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String resultado = atraspalante(input);
        System.out.println("al  reves:" + resultado);
     }

        static String atraspalante(String palabras) {
        return new StringBuilder(palabras).reverse().toString();

        }
       }  














