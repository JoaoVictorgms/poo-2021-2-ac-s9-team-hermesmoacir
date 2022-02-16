import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();
        System.out.println("# REGISTRO DE CONTA #");
        System.out.println("Digite o número da conta: ");
        c1.numero = sc.nextInt();
        System.out.println("Digite o nome do títular da conta: ");
        c1.nome_titular = sc.next();
        System.out.println("Digite o valor do saldo da conta: ");
        c1.saldo = sc.nextDouble();      
        byte opcao = 1;
        while(opcao == 1 || opcao == 2) {
            System.out.println("#- APP BANCO -#");
            System.out.println("Digite 1 para depositar | 2 para sacar");
            opcao = sc.nextByte();
            double valor;

            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar: ");
                    valor = sc.nextDouble();
                    c1.depositar(valor);
                    System.out.printf("\n VALOR DO SALDO ATUALIZADO: " + c1.saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = sc.nextDouble();
                    if(c1.sacar(valor)) {
                        System.out.println("SAQUE REALIZADO COM SUCESSO!");
                    } else {
                        System.out.println("SAQUE NÃO EFETUADO!");
                    }
                    break;
                default:
                    break;
            }
           
            System.out.println("\nDeseja continuar depositando ou sacando? 1 - Sim | 0 - Não");
            opcao = sc.nextByte();
        }

        sc.close();
    }
}
