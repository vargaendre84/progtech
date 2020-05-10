package ValutaStrategia;

import AllampapirStrategia.KoltsegStrategia;

public class Valuta_HUF extends Valutak
{
    KoltsegStrategia koltseg;
    private String nev;

    public Valuta_HUF(KoltsegStrategia koltseg, String nev)
    {
        this.koltseg = koltseg;
        this.nev = nev;
    }
    @Override
    public void getNev()
    {
        System.out.println(nev);
    }

    @Override
    public void ArfolyamNyereseg(){}

    @Override
    public void KoltsegSzamitas(){koltseg.KoltsegSzamitas();}
}
