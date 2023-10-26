package stream.desafioFilter;

public class ContaBancaria {

    final String nome;
    final boolean nomeNoSerasa;
    final double saldo;

    public ContaBancaria(String nome, boolean credito, double saldo) {
        this.nome = nome;
        this.nomeNoSerasa = credito;
        this.saldo = saldo;
    }


}
