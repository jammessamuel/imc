import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
                Scanner leitura = new Scanner(System.in);
                double mediaRating = 0;
                double note = 0;


                for (int i = 0; i < args.length; i++) {
                    System.out.println("say your review for the film");
                    note = leitura.nextDouble();
                    mediaRating += note;
                    
                }

                System.out.println(" Rating average " + mediaRating / 3 );

            }            
    
}
