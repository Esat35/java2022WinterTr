package pratik;

public class C03 {
    //
    //Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir
    //program yaziniz
    //Orn
    //: sayi1=10 ve sayi2=20
    //kod calistiktan sonra
    //sayi1=20 ve sayi2=10
    //2

    public static void main(String[] args) {

       int sayı1=10;
       int sayı2=20;

       int sayı3=sayı1;
       sayı1=sayı2;
       sayı2=sayı3;

        System.out.println("sayı1 son hal :"+sayı1);
        System.out.println("sayı2 son hal : "+sayı2);

    }
}
