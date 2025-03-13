package entity;

import java.util.ArrayList;
import java.util.List;
import Abstract.Conta;
import Interface.IBanco;

public class Banco implements IBanco {
  private List<Conta> contas = new ArrayList<>();

  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }

  public void listarContas() {
    for (Conta conta : contas) {
      System.out.println("Conta: " + conta.getNumero() + " - Cliente: " + conta.getCliente().getNome());
    }
  }
}