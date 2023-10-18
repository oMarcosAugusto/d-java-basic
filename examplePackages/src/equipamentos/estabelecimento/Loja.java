package equipamentos.estabelecimento;

import java.util.Scanner;

import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scan;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.multicunfional.EquipamentoMultiFuncional;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a operacao que deseja realizar (D - Digitalizadora | I - Impressora | C - Copiadora):");
        String escolha = scanner.next().toUpperCase();

        switch (escolha.toUpperCase()) {
            case "D":

                Digitalizadora dg = new Scan();
                dg.digitalizar();
                break;

            case "I":
                
                Impressora imp = new DeskJet();
                imp.imprimir();
                break;
                
            case "C":
                
                EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
                em.copiar();
                break;

            default:
                System.out.println("Escolha inválida. Por favor, escolha D, I ou C.");
        }

        scanner.close();
    }
}
