package Encapsulamento;

public class ContaBancaria {
    private double saldo; // Variável privada, não pode ser acessada diretamente

    public void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
