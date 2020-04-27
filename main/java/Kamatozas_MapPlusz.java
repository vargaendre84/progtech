public class Kamatozas_MapPlusz extends Strategia_Kamatozasi
{
    private double kamat;

    public Kamatozas_MapPlusz(double kamat)
    {
        this.kamat = kamat;
    }

    @Override
    public void Kamatozas()
    {
        System.out.println( kamat );
    }
}
