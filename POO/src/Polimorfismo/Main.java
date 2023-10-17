package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Chama o método específico da classe Cachorro
        meuAnimal.moder();
        
        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Chama o método específico da classe Gato
    }
}

// 3. Polimorfismo:
// Polimorfismo é como um interruptor de luz que pode ligar diferentes tipos de lâmpadas. Você não precisa saber como cada lâmpada é construída; você só precisa saber que todas elas podem ser ligadas da mesma maneira. No contexto da programação orientada a objetos, o polimorfismo permite que diferentes classes sejam tratadas como instâncias da mesma classe principal. Isso significa que você pode usar métodos de uma classe base em objetos de suas subclasses. Isso torna o código mais flexível e extensível, permitindo que você use diferentes classes de maneira uniforme.