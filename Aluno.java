import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite sua primeira nota : ");
        double nota1 = scanner.nextDouble();

         System.out.println(" Digite sua segunda nota : ");
        double nota2 = scanner.nextDouble();

        double mediafinal = (nota1 + nota2) / 2;

        if (mediafinal >= 5) {

            System.out.println(" Parabéns você foi aprovado sua média foi : !" + mediafinal);
        } else {

            System.out.println(" Infelizmente você não bateu sua média sua nota ficou : " + mediafinal);
        }

            System.out.println(" Boas Festas !");
    }
    
}
