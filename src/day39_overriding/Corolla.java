package day39_overriding;

public class Corolla extends Toyota {


    protected String hız = "corolla max 200 km hız yapar";
    protected String yakıt = "Corolla benzınlı veya elektrıklıdır.";
    protected String model = "Corolla";


    public void motor() {
        System.out.println("corolla araclar cevrecı  motor kullanırlar");
    }

    public void yakıtTuketımı() {
        System.out.println("corolla 5.6 yakıt  tuketır.");
    }

    public void vitesSayısı() {
        System.out.println("corolla 5 vıteslıdır");
    }


    public static void main(String[] args) {

        /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor'in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir
        Method'lar icin ise yine Data turunun oldugu class'a gideriz
        ancak direk method'u calistirmadan once
        method Override edilmis mi diye kontrol ederiz
         */

        Corolla araba1 = new Corolla();
        System.out.println(araba1.haraket);//araba classından calısır
        System.out.println(araba1.hız);// corolla classından
        System.out.println(araba1.yakıt);//corolla classından
        System.out.println(araba1.marka);//toyota classından
        System.out.println(araba1.sirketMerkezi);//toyota classından
        System.out.println(araba1.model);//corolla classından
        araba1.motor();

        Toyota araba2 = new Corolla();
        System.out.println(araba2.haraket);//araba classından
        System.out.println(araba2.hız);// toyota classından
        System.out.println(araba2.yakıt);//araba classından calısır
        System.out.println(araba2.marka);//toyota classından calısır
        System.out.println(araba2.sirketMerkezi);//toyota classından calısır
        // System.out.println(araba2.model);//cte verır
        araba2.motor();//corolla classından calısır
        araba2.garanti();//toyota classından calısır
        araba2.yakıtTuketımı();//corolla clasından calısır
     //araba2.vitesSayısı();// data turu olan toyotadan baslayınca boyle bır method bulamadık....cte verır


        Araba araba3 = new Corolla();
        System.out.println(araba3.haraket);//araba classından
        System.out.println(araba3.hız);// araba classından
        System.out.println(araba3.yakıt);//araba classından
        System.out.println(araba3.marka);//araba classından
        // System.out.println(araba3.sirketMerkezi);//CTE
        // System.out.println(araba3.model);//CTE
        araba3.yakıtTuketımı();//corolla clasındaki calısır
        araba3.motor();//corolla clasındakı calısır.
       // araba3.garanti();// aramaya araba clasından basladı ve methodu bulamadı ...cte
       // araba3.vitesSayısı();// aramaya araba clasından basladı ve methodu bulamadı ...cte


    }
}
