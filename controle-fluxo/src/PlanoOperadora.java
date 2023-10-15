import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o plano desejado (B, M ou T): ");
        String plano = sc.next().toUpperCase();

        switch (plano) {
            case "T": {
                System.out.println("100 minutos de ligacao");
                break;
            }
            case "M": {
                System.out.println("Whats e Instagra gratis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligacao");
            }
        }
    }
}
