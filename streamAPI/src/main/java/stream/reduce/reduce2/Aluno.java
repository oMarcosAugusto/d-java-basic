package stream.reduce.reduce2;

import java.util.Objects;

public class Aluno {

    final String nome;
    public final double nota;
    final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }
    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' + ", nota=" + nota
                + ", bomComportamento=" + bomComportamento + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(nota, aluno.nota) == 0 && bomComportamento
                == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
