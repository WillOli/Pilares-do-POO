package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressoa.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");

    }
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");

    }
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");


    }

    @Override
    public void digitalizadora() {

    }
}
