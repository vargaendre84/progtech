public class Kamatozas_InflacioAlapu extends Strategia_Kamatozasi
{
    private Viselkedes_Inflacio inflacio;
    private double kamatpremium;
    private int nevertek;
    private int futamido;
    private boolean tbsz;
    Kamatado kamatado;

    public Kamatozas_InflacioAlapu(int nevertek, int futamido, double kamatpremium, boolean tbsz)
    {
        this.nevertek = nevertek;
        this.futamido = futamido;
        this.kamatpremium = kamatpremium;
        this.tbsz = tbsz;
    }

    @Override
    public void Kamatozas()
    {
        System.out.println(nevertek * (kamatpremium + inflacio.AktualisInflacio()) * (1-kamatado.getKamatado(tbsz) * futamido)) ;
    }

}
