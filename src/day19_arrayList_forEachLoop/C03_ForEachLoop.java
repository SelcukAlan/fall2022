package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*
        Eger coklu element içeren yapıdaki tüm elemetlere aynı islemi yapmak istiyorsak indexden bagımsız olarak
        for each Loop kullanılabilir

        For each Loop 'da 3 şeyi belirtmemiz gerekir

        1- Getirilecek elementlerin data türü
        2-Getirilen elemente verilecek isim (genelde each / wkullanılır)
        3-
         */

        int [] arr={2,4,6,8,1};

        //bu array'ın lementlerini yazdıralım

        for (int each:arr
             ) {
            System.out.println(each+ " ");
        }
        // tum elementleri toplayalım
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;

        }
        System.out.println("Sayıların toplamı :"+toplam);
    }







}
