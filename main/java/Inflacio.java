public class Inflacio
{
    private static double Inflacio2019 = 0.034;    //2019 éves infláció 3.4%, https://www.mnb.hu 2020 március inflációs jelentés
    private double Inflacio2020 = 0.039;    //2020március: 3.9%, https://www.ksh.hu/
    private double Inflacio2021 = 0.035;    // inflációs előrejelzés mnb.hu 2020 március inflációs jelentés

    public double getEvesInflacio(int year)
    {
        switch(year)
        {
            case 2020: return Inflacio2020;
            case 2021: return Inflacio2021;
            default: return Inflacio2019;
        }
    }
}
/* TDD


4. getEvesInflacio2020 passed
public double EvesInflacio(int year)
    {
        switch(year)
        {
            case 2020: return Inflacio2020;
            case 2021: return Inflacio2021;
            default: return Inflacio2019;
        }
    }


3. getEvesInflacio2020 failed

a kód ugyanaz mint alább


2. getEvesInflacioDefault passed
public double EvesInflacio(int year)
    {
        switch(year)
        {
            default: return Inflacio2019;
        }
    }



1.   getEvesInflacioDefault failed
public double EvesInflacio(int year)
    {
        switch(year)
        {
            default: return 0;
        }
    }

 */