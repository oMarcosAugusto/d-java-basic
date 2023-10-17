package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setSaldo(1000);// Modifica o saldo usando o método público

        System.out.println("Saldo da conta: " + minhaConta.getSaldo()); // Obtém o saldo usando o método público
    }
    
}

// 2. Encapsulamento:
// Encapsulamento é como embalar um presente. Você coloca o presente dentro de uma caixa e escreve instruções na caixa sobre como usá-lo, mas você não precisa saber os detalhes sobre como o presente foi feito ou o que está dentro dele. Da mesma forma, no encapsulamento, você agrupa dados (variáveis) e métodos (funções) que operam nesses dados em uma única unidade chamada classe. Isso protege os dados, impedindo que outras partes do código acessem ou modifiquem diretamente esses dados. Em vez disso, eles precisam usar métodos especiais (métodos de acesso) fornecidos pela classe para interagir com os dados de maneira controlada.