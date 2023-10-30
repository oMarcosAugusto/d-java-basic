package stream.excecao.personalizadaA;

import stream.basico.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("", -7);

            Validar.aluno(aluno);
            Validar.aluno(null);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch ( IllegalArgumentException | NumeroForaIntervaloException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");

    }
}
