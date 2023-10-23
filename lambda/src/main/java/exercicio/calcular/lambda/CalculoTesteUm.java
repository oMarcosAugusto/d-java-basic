package exercicio.calcular.lambda;

public class CalculoTesteUm {
    public static void main(String[] args) {
        Calculo somar = new Somar();
        System.out.println(somar.executar(1, 6));

        Calculo multiplicar = new Multiplicar();
        System.out.println(multiplicar.executar(4, 6));
    }
}
