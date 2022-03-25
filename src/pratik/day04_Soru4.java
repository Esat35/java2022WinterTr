package pratik;

public class day04_Soru4 {
    public static void main(String[] args) {
        //Soru 4 )
        //double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin

        double sayı1=255.36;

        int sayı2=(int)sayı1;
        System.out.println(sayı2);//255

        byte sayı3=(byte)sayı2;
        System.out.println(sayı3);//-1
    }
}
