public class Kamatozas_Savos extends Strategia_Kamatozasi
{
    private double[] kamatsavok;
    private int[] idosavok;
    private boolean tbsz;

    public Kamatozas_Savos(double[] kamatsavok, int[] idosavok)
    {
        this.kamatsavok = kamatsavok;
        this.idosavok = idosavok;
    }


    @Override
    public void Kamatozas()
    {
        System.out.println(kamatsavok[0]);
    }
}
