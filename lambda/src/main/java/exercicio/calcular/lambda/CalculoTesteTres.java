package exercicio.calcular.lambda;

import java.util.function.BinaryOperator;

public class CalculoTesteTres {
    public static void main(String[] args) {
//        Calculo somar = (a,b) -> { return a + b; };
//        System.out.println(somar.executar(1,6));
//        Calculo multiplicar = (x,y) -> { return x + y; };
//        System.out.println(multiplicar.executar(1,6));

//        BinaryOperator - é uma interface funcional em Java que representa uma operação em dois
//        operandos do mesmo tipo, produzindo um resultado do mesmo tipo que os operandos. Em outras
//        palavras, é uma interface funcional para uma função que aceita dois parâmetros do mesmo tipo
//        e retorna um resultado do mesmo tipo.

        BinaryOperator<Double> soma = (a, b) -> a + b;  // forma mais curta
        System.out.println(soma.apply(1.0,6.0));

        BinaryOperator<Integer> somar = (a, b) -> a + b;  // forma mais curta
        System.out.println(somar.apply(1,6));

        BinaryOperator<Double>  multiplica = (x,y) -> x * y; // forma mais curta
        System.out.println(multiplica.apply(5.0,6.0));

//        System.out.println(soma.legal());
//        System.out.println(Calculo.muitoLegal());
    }
}
