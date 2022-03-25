package pratik;

public class String_manipulation_soru1 {
    public static void main(String[] args) {

        //Soru
        //1 String methodlarini kullanarak Java ogrenmek 123 Cok guzel@ String’ini “Java
        //ogrenmek cok guzel sekline getirin

        String str="Java ogrenmek 123 Cok guzel@";

        str = str.replace("123","");
        str = str.replace("C","c");
        str = str.replace("@","");


        System.out.println(str);



    }
}
