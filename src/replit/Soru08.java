package replit;

public class Soru08 {
    //Write a Java program that prints ascii values of characters from ‘a’ to ‘z’
    //
    //Expected Output:
    //
    //Ascii value of a = 97 Ascii value of b = 98 Ascii value of c = 99 Ascii value of d = 100 Ascii value of e = 101 Ascii value of f = 102 Ascii value of g = 103 Ascii value of h = 104 Ascii value of i = 105 Ascii value of j = 106 Ascii value of k = 107 Ascii value of l = 108 Ascii value of m = 109 Ascii value of n = 110 Ascii value of o = 111 Ascii value of p = 112 Ascii value of q = 113 Ascii value of r = 114 Ascii value of s = 115 Ascii value of t = 116 Ascii value of u = 117 Ascii value of v = 118 Ascii value of w = 119 Ascii value of x = 120 Ascii value of y = 121 Ascii value of z = 122

    public static void main(String[] args) {


        for (char i = 'a'; i <='z' ; i++) {
            int value=i;
            System.out.print("Ascii value of "+ i+" = "+value+" ");
        }
    }



}
