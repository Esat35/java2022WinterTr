package replit;

import java.util.ArrayList;
import java.util.List;

public class Soru20 {
    //Create a 10-element list. Swap the 8th element with the 3rd element.
    //
    //INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
    //
    //Output:
    //
    //[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

    public static void main(String[] args) {


        List<String> isimler=new ArrayList<String>();
        isimler.add("Umit");
        isimler.add("Emin");
        isimler.add("Kemal");
        isimler.add("Kerem");
        isimler.add("Taylan");
        isimler.add("Orhan");
        isimler.add("Sinan");
        isimler.add("Furkan");
        isimler.add("Ahmet");
        isimler.add("Ali");

       String sekizinciIndex = isimler.get(7);

       isimler.set(7,isimler.get(2));
       isimler.set(2,sekizinciIndex);


        System.out.print("["+isimler.get(0));
       for (int i = 1; i <isimler.size()-1;i++){
           System.out.print(","+isimler.get(i));
       }
        System.out.print(","+isimler.get(isimler.size()-1)+"]");



    }


}
