import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        terminal: while (true) {
            mostrarOpciones();
            input = scanner.next().toLowerCase();

            switch (input) {
                case "1":
                    int resultado = calculadora(scanner);
                    System.out.println("El resultado es:");
                    System.out.println(resultado);
                    break;
                case "2":
                    hackearnasa();
                    break;

                case "3":
                    System.out.println("Saliendo...");
                    break terminal;

            }

        }
    }

    static void mostrarOpciones() {
        System.out.println("Ingresa una opcion:");
        System.out.println("1. Calculadora");
        System.out.println("2. Hacker la nasa");
        System.out.println("3. salir");
    }

    static int calculadora(Scanner scanner) {
        System.out.println("Ingrese un numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo numero:");
        int b = scanner.nextInt();

        return a + b;
    }

    static void hackearnasa() {
        System.out.println("Hackeando nasa 😁");
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");
        System.out.println("Nasa hackeada");
    }


}



