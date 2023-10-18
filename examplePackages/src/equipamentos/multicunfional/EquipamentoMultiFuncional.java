package equipamentos.multicunfional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento MultiFuncinal");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }
    

}
