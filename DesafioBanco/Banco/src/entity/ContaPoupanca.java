package entity;

import Abstract.Conta;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  public void sacar(double valor) {
    if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Saque de " + valor + " realizado com sucesso.");
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Depósito de " + valor + " realizado com sucesso.");
  }
}