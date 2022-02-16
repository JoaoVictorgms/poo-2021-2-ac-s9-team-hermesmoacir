public class CTExercício01 {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 1;
        c1.nome_titular = "Francisco José";
        c1.saldo = 550.00;
        Conta c2 = new Conta();
        c2.numero = 2;
        c2.nome_titular = "Maria Clara";
        c2.saldo = 500.00;
    }

    // Da erro, pois a classe Conta tem seus atributos encapsulados.
}
