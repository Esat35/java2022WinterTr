package replit;

public class Soru12 {
    //Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
    //
    //Input : Coding is greate.
    //
    //Output : .etaerg si gnidoC

    public static void main(String[] args) {

        String str="Coding is greate.";
        String arr[]=str.split("");
String tersStr="";

        for (int i = 0; i <arr.length ; i++) {
            tersStr+=str.substring(str.length()-1-i,str.length()-i);
        }

        System.out.println(tersStr);
    }

}
