package pratik;

import java.util.Scanner;

public class String_manipulation_soru7 {
    public static void main(String[] args) {
        //Soru
        //7 Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        //yazdirin
        //isim
        //soyisim M***** B*******
        //kart
        //no 1234



        Scanner scan = new Scanner(System.in);
        System.out.print("isminizi gririniz :");
    String isim=scan.nextLine();
        System.out.print("soyisminizi giriniz : ");
    String soyisim=scan.next();

        System.out.print("kredi kartı numaranızı gırınız : ");
        String kartNo=scan.next();


        System.out.println("İsim : "+isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*"));
        System.out.println("Soy İsim : "+soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*"));
        System.out.println("kartNo : "+kartNo.substring(0,kartNo.length()-4).replaceAll("\\S","*")+kartNo.substring(kartNo.length()-4));


    }
}
