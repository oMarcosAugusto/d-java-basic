package Abstract;

public class Main {
    public static void main(String[] args) {
        Forma minhForma = new Circulo();
        minhForma.desenhar(); // Chama o método implementado na classe Circulo
    }
}


// 4. Abstract (Classe Abstrata):
// Uma classe abstrata é como um esboço de um objeto. Você sabe que um objeto terá certos métodos, mas não sabe exatamente como esses métodos serão implementados. Portanto, uma classe abstrata não pode ser instanciada diretamente; ela serve como um modelo para outras classes. As classes derivadas (subclasses) devem implementar os métodos abstratos definidos na classe abstrata. Isso garante que todas as subclasses tenham métodos comuns, mas permite que cada uma delas implemente esses métodos de maneira específica para suas próprias necessidades.