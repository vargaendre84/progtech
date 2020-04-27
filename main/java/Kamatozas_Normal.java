public class Kamatozas_Normal extends Strategia_Kamatozasi
{
    private int nevertek;
    private int futamido;
    private double kamat;
    private boolean tbsz;

    Kamatado kamatado = new Kamatado();

    public Kamatozas_Normal(int nevertek, int futamido, double kamat, boolean tbsz)
    {
        this.nevertek = nevertek;
        this.futamido = futamido;
        this.kamat = kamat;
        this.tbsz = tbsz;
    }

    public Kamatozas_Normal()
    {
        this.nevertek = 1000000;
        this.futamido = 3;
        this.kamat = 0.01;
        this.tbsz = true;
    }


    @Override
    public void Kamatozas()
    {
        double aktualiskamat = (nevertek * kamat * (1.0 - kamatado.getKamatado(tbsz))) * futamido;
        System.out.println(aktualiskamat);
    }

}
