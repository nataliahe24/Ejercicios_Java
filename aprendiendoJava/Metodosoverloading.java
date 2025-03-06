import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dependiendo de cuantos caracteres tengo va a ejecutar el metodo que concide
    int resultado = suma(2, 33);
    int resultado2 = suma(1, 2, 3);
        System.out.println(resultado);

        String texto = suma();
        System.out.println(texto);

    }

    static int suma(int a, int b ) {
        return a + b;

    }

        static int suma(int a, int b, int c){
        return a + b + c;
    }

    static String suma() {
        return "Hola mundo";
    }
    }
