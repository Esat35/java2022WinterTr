package pratik;

import java.util.Scanner;

public class day11_soru2 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //-
        //Girilen kelime cumlede kullanilmamis.
        //-
        //Girilen kelime cumlede 1 kere kullanilmis.
        //-
        //Girilen kelime cumlede 1’den fazla kullanilmis.


        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("aranacak kelimeyi giriniz");
        String kelime = scan.next();


        int ilkKullanim = cumle.indexOf(kelime);// -1 yada index

        int ikinciKullanim = cumle.indexOf(kelime, ilkKullanim + 1);

        if (ilkKullanim == (-1)) {
            System.out.println("girilen kelime cumlede kullanılmamıs");
        } else if (ikinciKullanim == (-1)) {
            System.out.println("girilen kelime cumlede 1 kere kullanılmış");
        } else  {
            System.out.println("girilen kelime cumlede birden fazla kullanılmış.");
        }


    }
}
