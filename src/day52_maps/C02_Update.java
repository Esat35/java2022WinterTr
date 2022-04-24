package day52_maps;
import day49_maps.MapOlustur;
import java.util.Map;
import java.util.Set;
public class C02_Update {

    // Verilen map'deki numarsı 102 olan kaydın bransını Java yapalim
    /*
    Map'te value komlex olabıldıgı ıcın
    value ıcerısınden bır bolumu degıstırmek ıstersek
    once value'ya ulasmak
    sonra onu manipule ederek istedigimiz degısıklıgı yapmak
    ve en son degısmıs halını yenıden Map'e eklemek gerekır.
     */

    public static void main(String[] args) {

        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);
        Set<Map.Entry<Integer,String>> sinifEntrySet= sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each: sinifEntrySet) {
            Integer keyEntry=each.getKey();
           if (keyEntry==102){
               String valueEntry= each.getValue();
               String valueArr[]= valueEntry.split(", ");
               valueArr[2]="Java";
               String valueYeni= valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", "
                       + valueArr[3];
               sinifListMap.put(keyEntry,valueYeni);
           }
        }
        System.out.println(sinifListMap);
    }
}
