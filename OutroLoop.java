import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);
                double mediaRating = 0;
                double note = 0;
                int totalOfNotes = 0;


                while (note != -1) {
                    System.out.println("say your rating for the film or type -1 to close");
                    note = leitura.nextDouble();
                    
                    if (note != -1) {

                        mediaRating += note;
                        totalOfNotes ++;
                    }
                   
                    
                }

                System.out.println(" Rating average " + mediaRating / totalOfNotes );

    }
}
