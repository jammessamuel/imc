import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipodeConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("********************");
        System.out.println("\nNome do Cliente "+ nome);
        System.out.println(" Tipo Conta " + tipodeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************");


        String menu = """
                *** Digite sua opção : ***
                1 - Consultar saldo
                2 - Transferir valor via PIX
                3 - Receber um valor
                4 - Sair
        """;

        Scanner Leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = Leitura.nextInt();

            if (opcao == 1) {
                System.out.println(" O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir " );
                double valor = Leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não a saldo para reaizar a tranferência !");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo); 
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido ");
                double valor = Leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida !");
            }
        }
    }
}
