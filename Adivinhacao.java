import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int numeroRecebido;
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.println(" Tente adivinhas o número Surpresa de 0 a 10 ");
            numeroRecebido = scanner.nextInt();

            if (numeroRecebido == numeroAleatorio) {
                System.out.println( " Parabéns você acertou ! " );
            } else if (numeroRecebido < numeroAleatorio) {
                System.out.println(" Você chutou um número menor que o correto ! ");

            } else {

                System.out.println(" Você chutou um número mauor que o correto ! ");
            }
        }
        System.out.println(numeroAleatorio);
        System.out.println(" Número de tentativas " + i);
    
    }
    
}