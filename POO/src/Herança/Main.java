package Herança;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Bicicleta minhBicicleta = new Bicicleta();

        meuCarro.ligar(); // Chama o metodo da classe Carro
        System.out.println("Meu carro tem " + meuCarro.rodas + " rodas.");

        minhBicicleta.ligar(); // Chama o metodo da classe Bicicleta
        System.out.println("Minha bicicleta tem " + minhBicicleta.rodas + " rodas.");
    }
    
}

// 1. Herança:
// Imagine que você tem diferentes tipos de veículos, como carros, bicicletas e motos. Todos esses veículos têm algumas características em comum, como rodas e motor. A herança permite que você crie uma classe principal chamada "Veículo" com essas características comuns. Em seguida, você pode criar classes derivadas (ou subclasses) como "Carro", "Bicicleta" e "Moto", que herdam as propriedades da classe "Veículo". Isso significa que as subclasses têm todas as características da classe principal, além de suas próprias características exclusivas.