package exercicio.calcular.lambda;
@FunctionalInterface
public interface Calculo {
    double executar(double a, double b); // public abstract

    default String legal() {
        return "legal";
    }
    static String muitoLegal() {
        return "Muito legal";
    }
}
