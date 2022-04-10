package day39_overriding;

public class Araba {
   protected String haraket="arabalar teker ile hareket eder";
   protected String hız="arabalar motor gucune gore hız  yaparlar";
   protected String yakıt ="arabalar farklı yakıtlar kullanabılır";
   protected String marka="arabalar uretıldıklerı markaya sahıptır";


    public void motor(){
        System.out.println("arabalar faklı markalarda motor kullanırlar");
    }

    public void yakıtTuketımı(){
        System.out.println("arabalar motor gucu ve yakıt turune gore yakıt  tuketırler.");
    }
}
