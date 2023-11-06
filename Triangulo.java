import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.println(" Digite o primeiro lado do Triângulo : ");
            double lado1 = scanner.nextDouble();

            System.out.println(" Digite o segundo lado do Triângulo : ");
            double lado2 = scanner.nextDouble();

            System.out.println(" Digite o terceiro lado do Triângulo : ");
            double lado3 = scanner.nextDouble();

            if (lado1 == lado2 && lado2 == lado3) {

                System.out.println(" Seu triangulo tem 3 lados iguais é um equilátero ! ");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {

                System.out.println(" É um triângulo isósceles. ");
            } else {
                
                System.out.println("É um triângulo escaleno ");
            } if (lado1 != lado2 && lado2 != lado3) {

                System.out.println(" Seu triângulo é inválido ! ");
            }

                
            }
        
             

    }
    

