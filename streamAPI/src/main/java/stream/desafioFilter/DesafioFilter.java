package stream.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto p1 = new Produto("Lapis", 1.99, 0.12, 0);
        Produto p2 = new Produto("Relogio", 1900, 0.12, 0);
        Produto p3 = new Produto("Penal", 1.99, 0.12, 30);
        Produto p4 = new Produto("Impressora", 1200, 0.40, 0);
        Produto p5 = new Produto("Monitor", 500, 0.31, 30);
        Produto p6 = new Produto("Mochila", 699, 0.12, 30);
        Produto p7 = new Produto("Notebook", 4899.99, 0.32, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> promocao = p -> p.desconto >= 0.3; //pega apenas os itens que o desconto seja maior ou igual a 30%(0.3%).
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0; // pega so os produtos que nao possuem frete.
        Predicate<Produto> precoRelevante = p -> p.preco >= 500; // pega apenas os produtos com valor igual ou maior a 500.

        Function<Produto, String> chamadapromocional = p -> "Aproveite! " + p.nome
                + " por " + p.preco;

        produtos.stream()
                .filter(promocao)
                .filter(freteGratis)
//                .filter(precoRelevante)
                .map(chamadapromocional)
                .forEach(System.out::println);
    }
}
