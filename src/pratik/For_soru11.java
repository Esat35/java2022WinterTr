package pratik;

import java.util.Scanner;

public class For_soru11 {
    public static void main(String[] args) {
        //Soru 11 ) Interview Question
        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("10 dan kucuk bır tam sayı gırınız :");
        int sayı=scan.nextInt();
int faktoryel=1;
String faktoryelYazımı="";

        for (int i = sayı; i >=1 ; i--) {

            faktoryel*=i;

            if(sayı==1){
               faktoryelYazımı+=i;
            }else{
                faktoryelYazımı+=i+"*";
            }

        }

        System.out.println(sayı+"! = "+faktoryelYazımı+" = "+faktoryel);


    }
}
