package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressoa.DeskJet;
import equipamentos.impressoa.Impressora;
import equipamentos.impressoa.LaserJet;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Impressora impressora = em;
        impressora.imprimir();

        Copiadora copiadora = em;
        em.copiar();

        Digitalizadora digitalizadora = em;


//        Impressora impressora = new LaserJet();
//        impressora.imprimir();
//
//        Impressora impressora1 = new DeskJet();
//        impressora1.imprimir();
//
//        Copiadora copiadora = new Xerox();
//
//        copiadora.copiar();



    }
}