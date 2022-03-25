package pratik;

public class C04 {

    public static void main(String[] args) {

        //Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
        //degistiren (SWAP) bir program yapiniz

        int sayı1=10;
        int sayı2=20;

        System.out.println("Sayıların ilk hali "+"sayı1 : "+sayı1+",     "+"sayı2 : "+sayı2);
        sayı1=sayı1-sayı2;

        sayı2=sayı1+sayı2;

        sayı1=sayı2-sayı1;

        System.out.println("Sayıların son hali "+"sayı1 : "+sayı1+",     "+"sayı2 : "+sayı2);


    }
}
