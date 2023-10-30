package stream.checadaVsNao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim!");
    }
    static void geraErro1() {
        //Nao checada ou nao verificada
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }
    // Excecao checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um novo erro #02");
    }
}
