import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Enter your favorite movie");

                String movie = leitura.nextLine();
                System.out.println("What is the year of release?");
                int releaseYear = leitura.nextInt();
                System.out.println("say your review for the film");
                double assessment = leitura.nextDouble();
                
                System.out.println(movie);
                System.out.println(releaseYear);
                System.out.println(assessment);
    }
    
}
