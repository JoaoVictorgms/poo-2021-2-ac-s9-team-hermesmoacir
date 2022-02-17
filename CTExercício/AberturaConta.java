import java.util.Scanner;
import java.util.ArrayList;

public class AberturaConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> listaContas = new ArrayList<>();
        
        byte opcao = 1;

        System.out.println("# App Banking");
        while(opcao != 0) {
            System.out.println("\n0 - SAIR | 1 - Criar conta | 2 - Visualizar saldo | 3 - Realizar saque | 4 - Realizar depósito");
            opcao = sc.nextByte();
            int numero;
            switch(opcao) {
                case 1: 
                    System.out.println("# Abertura de conta");
                    System.out.println("Digite o nome do titular da conta: ");
                    String nome = sc.next();
                    System.out.println("Digite o valor do saldo inicial da conta: ");
                    double valor = sc.nextDouble();
                    Conta conta = new Conta();
                    numero = listaContas.size() + 1;
                    conta.abrirConta(numero, nome, valor);
                    listaContas.add(conta);
                    break;
                case 2:
                    System.out.println("# Visualizar saldo de uma conta");
                    System.out.println("Digite o número da conta: ");
                    int num = (int) sc.nextInt();

                    for(Conta c : listaContas) {
                        if(c.numero == num) {
                            System.out.print("\nO saldo da conta de número " + c.numero + " é de R$" + c.saldo);
                        }
                    }

                    break;
                case 3: 
                    System.out.println("# Realizar saque");
                    System.out.println("Digite o número da conta: ");
                    num = sc.nextInt();
                    System.out.println("Digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    for(Conta c: listaContas) {
                        c.sacar(valorSaque);
                    }
                    break;
                    case 4: 
                    System.out.println("# Realizar depósito");
                    System.out.println("Digite o número da conta: ");
                    num = sc.nextInt();
                    System.out.println("Digite o valor para saque: ");
                    double valorDeposito = sc.nextDouble();
                    for(Conta c: listaContas) {
                        c.depositar(valorDeposito);
                    }
                    break;                    
            }
        }
        System.out.println("APP ENCERRADO");
        sc.close();
    }
}
