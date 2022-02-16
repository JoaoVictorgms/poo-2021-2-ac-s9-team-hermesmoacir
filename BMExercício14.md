**14.Qual a importância de usar o encapsulamento na definição de classes? Exemplifique.** <br>
**R:** O encapsulamento é importante para proteger a estrutura interna de uma classe dos meios externos de acesso a ela. Ele permite que, por exemplo, um atributo de uma classe só seja alterado por métodos desta mesma classe, evitando que usuários externos os modifiquem de maneira errônea. 

**exemplo:** <br>

public Conta {
    private String nomeCliente; <br>
    private boolean contaEspecial; <br>
    private double saldo; <br>

    void abrirConta(String nome, boolean contaEspecial, double saldo) {  
        this.nomeCliente = nome; 
        this.contaEspecial = contaEspecial;
        this.saldo = saldo;
    }
}

<br>

O encapsulamento pode ser visto através do qualificador de acesso 'private' nos atributos da classe. Esse modificador de acesso encapsula os atributos da classe, bloqueando qualquer tentativa de acesso e modificação por qualquer agente externo. Para modificar o valor do saldo, por exemplo, seria preciso acessar usando um método **setSaldo()**, por exemplo, e não somente instanciar a classe conta, para depois modificar diretamente o valor do atributo com a sintaxe nome.atributo = valor;.

