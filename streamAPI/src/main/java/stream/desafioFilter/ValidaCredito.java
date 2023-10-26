package stream.desafioFilter;

import java.util.Arrays;
import java.util.List;

public class ValidaCredito {
    public static void main(String[] args) {

        ContaBancaria cb = new ContaBancaria("Joao", false, 23.000 );
        ContaBancaria cb2 = new ContaBancaria("Ana", true, 230.000 );
        ContaBancaria cb3 = new ContaBancaria("Tyke", false, 3.540 );
        ContaBancaria cb4 = new ContaBancaria("Kyle", true, 2.000 );
        ContaBancaria cb5 = new ContaBancaria("Eric", true, 5.000 );


        List<ContaBancaria> contaBancarias = Arrays.asList(cb, cb2, cb3, cb4, cb5);

        contaBancarias.stream()
                .filter(c -> c.saldo >= 3.000 && !c.nomeNoSerasa)
                .map(c -> "Parabens " + c.nome + " seu credito foi aprovado")
                .forEach(System.out::println);

    }
}
