import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamano desejado: (P, M ou G)");
        String sigla = sc.next().toUpperCase();

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default : {
                System.out.println("Nao encontrado");
            }
        }
    }
}
