package interfaces.funcionais.unaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int res1 = maisDois // de cima para baixo
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(res1);

        int res2 = aoQuadrado // de baixo para cima
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);
        System.out.println(res2);


    }
}
