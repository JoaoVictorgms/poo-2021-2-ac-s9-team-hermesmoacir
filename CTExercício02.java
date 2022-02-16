import java.util.Scanner;
import java.util.ArrayList;

public class CTExercício02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> listaContas = new ArrayList<>();

        byte opcao = 0;
        
        while(opcao > 0 || opcao <= 4) {
            System.out.println("# App Banking");
            System.out.println("0 - SAIR | 1 - Abrir nova conta | 2 - Visualizar saldo de uma conta | 3 - Realizar saque | 4 - Realizar depósito");    
            opcao = sc.nextByte();
            byte numConta = 1;
            switch(opcao) {
                case 1: 
                    System.out.println("Abertura de conta: ");
                    Conta conta = new Conta();
                    System.out.println("Digite o nome do proprietário(a) da conta: ");
                    String nome = sc.next();
                    System.out.println("Digite o valor do saldo inicial da conta: ");
                    double saldo = sc.nextDouble();
                    conta.abrirConta(numConta, nome, saldo);
                    listaContas.add(conta);
                    numConta++;
                    break;
                // case 2:
                //     System.out.println("Visualizar saldo de uma conta - Digite o número da conta");
                //     int numero = sc.nextInt();
                //     for(Conta n : listaContas) {
                //         if()
                //     }
                default:
                    break;
            }

        }

    }
}
