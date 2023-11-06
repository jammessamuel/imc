public class Temperatura {

    public static void main(String[] args) {

        double temperaturaC = 32.01;
        int tempraturaF = (int) (temperaturaC * 1.8) + 32;
        System.out.println(String.format("A temperatura %.2f Celsius equivale a %d Fahrenheit !", temperaturaC, tempraturaF));
        
        
    }
}