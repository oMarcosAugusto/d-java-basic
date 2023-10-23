package exercicio.calcular.lambda;

public class CalculoTesteTres {
    public static void main(String[] args) {
        Calculo somar = (a,b) -> { return a + b; };
        Calculo soma = (a,b) -> a + b;  // forma mais curta

        System.out.println(somar.executar(1,6));
        System.out.println(soma.executar(1,6));

        Calculo multiplicar = (x,y) -> { return x + y; };
        Calculo multiplica = (x,y) -> x * y; // forma mais curta
        System.out.println(multiplicar.executar(1,6));
        System.out.println(multiplica.executar(5,6));

        System.out.println(soma.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
