package foreach.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Gui");
        System.out.println("Forma tradicional:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01: ");
//        aprovados.forEach((nome) -> {
//            System.out.println(nome + " *");
//        });        OU(||)
          aprovados.forEach(nome -> System.out.println("* " + nome));

        System.out.println("\nMethod Reference: ");
          aprovados.forEach(System.out::println);   // passa o valor da lista direto pro print
    }
}
