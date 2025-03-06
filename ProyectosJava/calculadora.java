import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esta es una aplicacion de calculadora");
        System.out.println("Ingrese el primer numero");
        Scanner sacanner = new Scanner(System.in);
        int valorA = sacanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int valorB = sacanner.nextInt();
        System.out.println("El resultado de la suma es:");

        System.out.println(valorA+valorB);

    }
}