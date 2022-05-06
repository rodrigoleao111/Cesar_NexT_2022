/**
 * Exercício da aula 4
 * ● Crie um novo projeto.
 * ● Crie uma classe Cliente contendo como atributos públicos o cpf e o nome do cliente.
 * ● Na classe App, crie um objeto do tipo Cliente e teste o acesso aos atributos de um objeto cliente.
 * ● Implemente uma classe chamada Conta que possui como atributos privados o número e o saldo da conta.
 * ● Crie um método que altera o saldo da conta e outro que retorna o saldo da conta.
 * ● Na classe App, crie um objeto do tipo Conta e teste o acesso aos métodos de um objeto conta.
 */

import classes.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício Classes");

        //instanciar um objeto
        Cliente cli1 = new Cliente();
        
        //teste de acesso à atributos de Cliente
        cli1.nome = "Rodrigo";
        cli1.cpf = "107.620.594-19";
        imprimeDadosDoCliente(cli1);

        //teste de acesso à atributos de Conta
        cli1.contaCliente.setSaldo(500.0f);
        imprimeDadosDaConta(cli1);

        
    }

    public static void imprimeDadosDaConta(Cliente pessoa){
        System.out.println("\nDADOS DA CONTA");
        System.out.println("Número da conta: " + pessoa.contaCliente.numConta +"\nSaldo: " + pessoa.contaCliente.getSaldo());
    }

    public static void imprimeDadosDoCliente(Cliente pessoa){
        System.out.println("\nDADOS DO CLIENTE \nNome: " + pessoa.nome +"\nCPF: " + pessoa.cpf);
    }
}
