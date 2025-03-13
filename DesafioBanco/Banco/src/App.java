import entity.*;
import Abstract.*;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente2);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(1000);
        conta1.transferir(conta2, 200);
        conta2.sacar(100);

        banco.listarContas();
    }
}