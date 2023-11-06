import javax.print.DocFlavor.STRING;

public class HelloWorld {

        

    public static void main (String[] args){

       
        System.out.println(" Welcome to Screen Match! ");
        
        int releaseYear = 2022;
        System.out.println(" The year of release is : " + releaseYear);
        boolean includedInThePlan = true;
        double noteFromFilm = 8.1;
        

        //average calculated by Samuel, Wesley and Hitallo
        double avarege = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(avarege);
        String synopsis;
        synopsis = """
            Movie Top Gun
            Adventure film with 80s heartthrob
            Very Good!
            Realise Year 
            """ + releaseYear;
        System.out.println(synopsis);

        int classification;
        classification = (int) (avarege / 2);
        System.out.println(classification);
        
        
    


    }

      
    
}

        
