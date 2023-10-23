package interfaces.funcionais.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
//      Consumer, aceita um unico argumento e nao retorna nada
        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome);

        Produto p1 = new Produto("Notebook", 2987.00, 0.25);
        Produto p2 = new Produto("Caderno", 19.90, 0.03);
        Produto p3 = new Produto("Borracha", 7.80, 0.18);
        Produto p4 = new Produto("Lapis", 4.39, 0.19);

//        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
