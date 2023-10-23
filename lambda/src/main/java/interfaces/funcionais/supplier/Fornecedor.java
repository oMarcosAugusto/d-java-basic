package interfaces.funcionais.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
//      Supplier representa um fornecedor de resultados. Em outras palavras, um Supplier não
//      aceita nenhum argumento, mas fornece um resultado quando invocado. Ela define um
//      método chamado get(), que retorna um valor do tipo especificado.
        Supplier<List<String>> umLista =
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(umLista.get());
    }
}
