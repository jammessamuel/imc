public class Condicional {

    public static void main(String []args) {

        int releaseYear = 1986;
        boolean includedInThePlan = true;
        double noteFromFilm = 8.1;
        String typePlan = "plus";

        if (releaseYear >= 2022) {

            System.out.println("Launch that customers are enjoying!");
        } else {

            System.out.println("Retro movie worth watching");
        }


        if (includedInThePlan == true || typePlan.equals("plus")) {

            System.out.println("film released");
        } else {
            
            System.out.println("You must pay the rent");
        }
    }
    
}
