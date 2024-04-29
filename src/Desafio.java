import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Lucas Miranda";
        String tipoConta = "Corrente";
        double saldo = 1799.99;

        System.out.println("*************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*************************************");

        String menu = """
                ** Digite sua opção **
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;

        Scanner ler = new Scanner(System.in);

        int opcao = 0;
        while(opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = ler.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente para realizar a transferencia");
                }else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = ler.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida!");
            } else if (opcao == 4) {
                System.out.println("Até mais!");
            }

        }

    }

}

