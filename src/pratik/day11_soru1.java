package pratik;

import java.util.Scanner;

public class day11_soru1 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
        //olmadigini yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println(" bir cumle gırınız");
        String cumle=scan.nextLine();
        System.out.println("arama yapılacak harfı gırınız.");
    String harf=scan.next();

    int harfVarMı=cumle.indexOf(harf);
    if (harfVarMı>=0){
        System.out.println("aradıgınız harf cumlede var.");
    }else {
        System.out.println("aradıgınız harf cumlede yok.");
    }

    }

}
