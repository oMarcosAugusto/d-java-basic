package interfaces.funcionais.predicate;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        // Precicate recebe um valor e retorna se ele e true ou false
        Predicate<Produto> isCaro =
                produto -> (produto.preco *(1 - produto.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 3895.89, 0.15);
        System.out.println(isCaro.test(produto));

    }


}
