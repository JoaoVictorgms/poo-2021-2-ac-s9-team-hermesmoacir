public class Conta {
    private int numero;
    private String nome_titular;
    private double saldo;

    void abrirConta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome_titular = nome;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    boolean sacar(double valor) {
        if(this.saldo>=valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
