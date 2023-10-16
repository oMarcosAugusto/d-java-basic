import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.scene.input.InputEvent;

public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        // double altura = Double.valueOf(args[3]);

        // System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        // System.out.println("Tenho " + idade + " anos ");
        // System.out.println("Minha altura é " + altura + "cm ");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ",tenho " + idade + " anos," + " e " + altura + "m de altura!");
        }
        catch(InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numericos!");
        }
        
    }
}
