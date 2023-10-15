import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor");
        int nota = sc.nextInt();

        // String resultado = nota >= 7 ? "Aprovado" : "Repovado";
        String resultado = nota >= 7 && nota <=9 ? "Aprovado" : nota >= 5 && nota < 7 ? "recuperacao" : nota == 10 ? "Voce e foda" : "Voce e o bichao mesmo";

        System.out.println("Voce foi: " + resultado);

        // if (nota >= 7)
        // System.out.println("Aprovado");
        // else if (nota > 5 && nota < 7)
        // System.out.println("Recuperacao");
        // else
        // System.out.println("Reprovado");
    }
}
