package KoltsegDecorator;

public class Koltseg_Biztositas extends KoltsegDecorator {
    private static int lakasBiztositasEvesDij = 480000;
    private static int extraKPBiztositasEvesDij = 260000;

    public Koltseg_Biztositas(IKoltseg alapKoltseg) {
        super(alapKoltseg);
    }

    @Override
    public String getKoltsegNem() {
        return alapKoltseg.getKoltsegNem() + " + lakásbiztosítás és extra készpénzbiztosítás éves díja ";
    }

    @Override
    public double getKoltseg(long nevErtek, int futamIdo) {
        return alapKoltseg.getKoltseg(nevErtek,futamIdo) + (lakasBiztositasEvesDij + extraKPBiztositasEvesDij)*futamIdo;
    }
}