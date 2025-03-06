import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age?");
        int age = scanner.nextInt();


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Gone to adult?");
        boolean isWithAdult  = scanner1.nextBoolean();

        String movieClassification = "RP18";
   boolean isRestricted = movieClassification.contains("R");

   if(!isRestricted)
   {
       System.out.println("You can see the movie");
   }
   else if (age > 17)
   {
       System.out.println("You can see the movie too");
   }
   else if (isWithAdult && movieClassification.contains("RP"))

   {
           System.out.println("Gone with adult,you can see the movie");
   }
   else
   {
           System.out.println("You can't see the movie");
   }
}
}