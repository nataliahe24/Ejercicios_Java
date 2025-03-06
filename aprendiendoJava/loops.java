import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
        System.out.println("Ingresa un comando");
        input = scanner.next().toLowerCase();

        if (input.equals("salir")) {
            break;
        }

        if (input.equals("continuar")){
            continue;
        }
        System.out.println("Esta linea no se deberia ejecutar");
        }
        System.out.println("Termino el loop");
    }
    }