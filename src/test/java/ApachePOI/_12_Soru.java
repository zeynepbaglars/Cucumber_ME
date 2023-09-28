package ApachePOI;


/*
   Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
   path i verilen excel için, program her çalıştıkça içine "test passed"
   yazısını ekleyen metodu yazınız.
   Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
   dosya varsa en son satırın altına yaz.
 */

public class _12_Soru {
    public static void main(String[] args) {
        path="src/test/java/ApachePOI/resource/SenaryoSonuclari.xlsx";
        String bilgi="test passed";

        exceleYaz(path,bilgi)
    }

    exceleYaz(path, bilgi){

        File file=new File(path);

        if (!file.exists) // dosya yok ise

        dosya yok ise oluştur ilk satıra verilen bilgiyi yaz
        var ise , son satıra biliyi yaz

    }

}
