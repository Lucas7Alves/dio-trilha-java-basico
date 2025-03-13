package Abstract;

import entity.*;

public abstract class Conta {
  private static int contador = 1000;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.numero = contador++;
    this.saldo = 0;
    this.cliente = cliente;
  }

  public abstract void sacar(double valor);

  public abstract void depositar(double valor);

  public void transferir(Conta destino, double valor) {
    if (valor > 0 && saldo >= valor) {
      this.sacar(valor);
      destino.depositar(valor);
      System.out.println("Transferência de " + valor + " realizada para a conta " + destino.numero);
    } else {
      System.out.println("Saldo insuficiente para transferência.");
    }
  }

  public int getNumero() {
    return numero;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public double getSaldo() {
    return saldo;
  }
}