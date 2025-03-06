import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int resultado = contarVocales(input);
        System.out.println("Cantidad de vocales es:" + resultado);
     }

        static int contarVocales(String palabras) {
            int contador = 0;
        palabras = palabras.toLowerCase(); // Convertimos todo a minúsculas

        for (int i = 0; i < palabras.length(); i++) {
        char letra = palabras.charAt(i);
                     if (esVocal(letra)) {
                            contador++;
                        }
                    }
                    return contador;
                }

                static boolean esVocal(char c) {
                return "aeiou".indexOf(c) != -1; // Devuelve true si es una vocal
                }
            }