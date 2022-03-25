package pratik;

import java.util.Scanner;

public class For_soru9 {
    public static void main(String[] args) {
        //Soru 9 ) Interview Question
        //Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        //palindrome olup olmadigini kontrol eden bir program yazin.



        Scanner scan = new Scanner(System.in);
        System.out.print("bır String gırınız : ");
        String str = scan.nextLine();
        String tersStr = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            tersStr += str.substring(str.length() - 1 - i, str.length() - i);
        }
        System.out.println("Girdiğiniz cumlenın tersten yazılısı : "+tersStr);

        if (tersStr.equalsIgnoreCase(str)) {

            System.out.println("palındrome");
        }else System.out.println("palındrome degıl.");
    }




    }

