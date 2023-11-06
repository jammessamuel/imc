public class Temperatura2 {

    public static void main(String[] args) {

        double temperaturaC = 32.01;
        int temperaturaF =(int) (temperaturaC * 1.8) + 32;
        String clima;
        String temperatura;
        clima = """

        A temperatura de %2.f Celsius equivale a %d em Fahrenheit !
""" + temperaturaC + temperaturaF;

        System.out.println(clima);
        
    }
}