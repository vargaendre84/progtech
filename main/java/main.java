public class main {

    public static void main(String[] args) {
        final Jegybank jegybank = Jegybank.getInstance();
        jegybank.nev = "Magyar Nemzeti Bank";
        jegybank.alapkamat = 0.009;  //2020.03.25.  mnb.hu
        jegybank.keszpenzallomany = 6620; //milliárd ft,  2020.01.20. mnb.hu
        final Allamkincstar allamkincstar = Allamkincstar.getInstance();
        allamkincstar.allamkincstar = "Magyar Államkincstár";

        AllamKotveny EMAP2021_18 = new Allampapir_EMAP(new Kamatozas_Normal(1000000,1,0.025,false),"Egy éves magyar Állampapír 2021-18");
        AllamKotveny EMAPtemp = new Allampapir_EMAP(new Kamatozas_Normal(),"Template Állampapír");

        System.out.print("Állampapír neve: ");
        EMAP2021_18.getNev();
        System.out.print("Állampapír kamatozása: ");
        EMAP2021_18.Kamatozas();

        System.out.print("Állampapír neve: ");
        EMAPtemp.getNev();
        System.out.print("Állampapír kamatozása: ");
        EMAPtemp.Kamatozas();
    }

}
