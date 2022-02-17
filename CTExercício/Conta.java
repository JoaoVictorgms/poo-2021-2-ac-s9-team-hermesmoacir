public class Conta {
    int numero;
    String nome_titular;
    double saldo;

    public void abrirConta(int numero, String nome_titular, double valor) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = valor;
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