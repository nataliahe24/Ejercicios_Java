import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String input = "";

       terminal: while (true) {
           System.out.println("Ingresa una opcion:");
           System.out.println("1. Calculadora");
           System.out.println("2. Hacker la nasa");
           System.out.println("3. salir");

        input = scanner.next().toLowerCase();

        switch (input) {
            case "1":
                System.out.println("Ingrese un numero");
                int a = scanner.nextInt();
                System.out.println("Ingrese segundo numero:");
                int b = scanner.nextInt();
                System.out.println("El resultado es:");
                System.out.println(a + b);
                break;
            case "2":
                System.out.println("Hackeando nasa 😁");
                System.out.println("#");
                System.out.println("##");
                System.out.println("###");
                System.out.println("####");
                System.out.println("Nasa hackeada");
                break;

            case "3":
                System.out.println("Saliendo...");
                break terminal;

        }

       }
    }
    }
