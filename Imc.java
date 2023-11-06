import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite seu peso em Kg : ");
      double peso = scanner.nextDouble();
      
      System.out.println("Digite sua altura : ");
      double altura = scanner.nextDouble();

      double imc = peso / (altura * altura);
      
      System.out.println("Seu imc é : " + imc);

      if (imc < 18.5) {
        System.out.println("Esta a abaixo do peso! ");
      } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println(" Taxa de imc Normal ");
      } else if (imc >= 25 && imc <= 29.9) {
        System.out.println("Taxa de sobrepeso: ");
      } else if (imc >= 30 && imc <= 34.9) {
        System.out.println("Obesidade Grau 1 (Leve)");
      } else if (imc >= 35 && imc <= 39.9) {
        System.out.println("obesidade grau 2 (moderada) ");
      } else {
        System.out.println("Obesidade grau 3 (Grave) cuide-se ! ");
      }

      scanner.close();
       
    }
}
