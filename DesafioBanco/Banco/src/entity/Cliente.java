package entity;
import Interface.ICliente;

public class Cliente implements ICliente {
  private String nome;

  public Cliente(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}