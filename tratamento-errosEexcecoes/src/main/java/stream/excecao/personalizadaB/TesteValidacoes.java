package stream.excecao.personalizadaB;

import stream.basico.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) throws StringVaziaException, NumeroForaIntervaloException {

        try {
            Aluno aluno = new Aluno("", -7);

            Validar.aluno(aluno);
            Validar.aluno(null);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException | NumeroForaIntervaloException e){
            System.out.println(e.getMessage());
        }
        Validar.aluno(null);
        System.out.println("Fim");

    }
}
