package replit;

import java.util.Scanner;

public class Soru01 {

        public static void main(String[] args) {
//Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

            Scanner scan=new Scanner(System.in);
            System.out.print(" isim giriniz : ");
            String isim=scan.nextLine();

            System.out.print("karakter  giriniz : ");
          char harf=scan.next().charAt(0);

int count=0;
            for( int  i=0; i< isim.length();i++){

                if (isim.charAt(i)==harf){
                    count++;
                }

            }

            System.out.println(" Number of "+harf +" = "+count);
        }

}
