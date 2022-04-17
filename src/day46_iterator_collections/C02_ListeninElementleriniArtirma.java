package day46_iterator_collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {
        // verilen listedeki her elementi 3 artirin
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]

        /* listenin tum elementlerini bize getirmesi icin
           iterator'un hasNext() ve next() methodlarini kullanacagiz
         */
        Iterator itr = liste.iterator();

        while(itr.hasNext()){ // yaninda element oldugu muddetce calisacak
            System.out.println(itr.next());
        }
    }
}
