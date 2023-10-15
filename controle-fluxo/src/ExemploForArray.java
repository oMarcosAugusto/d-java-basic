public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos[] = {"Marcos", "Jana", "Emer", "Ari", "Vitor"};

        // for (int i = 0; i < alunos.length; i++) {
        //     System.out.println("O aluno no indice " + i + " e " + alunos[i]);
        // }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}
