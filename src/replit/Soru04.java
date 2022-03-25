package replit;

public class Soru04 {
    //Write a return method that accepts an integer as input and calculates factorial and prints like output.
    //
    //Input : 6
    //
    //Output: 6!=65432*1=720


    public static void main(String[] args) {

int sayı=6;

        System.out.print(sayı+"!=");
int carpım=factorial(sayı);

        System.out.print("1="+carpım);


    }

    private static int factorial(int sayı) {
        int carpım=1;

        for (int i = sayı; i >1 ; i--) {
            System.out.print(i+"*");
            carpım*=i;
        }


        return carpım;
    }
}
