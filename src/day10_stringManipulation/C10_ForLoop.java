package day10_stringManipulation;

public class C10_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen sayıdan başlayarak
        //7 şer 7 şer artırarak input olarak verilen bitiş sayısına kadar tüm sayıların
        //kaç adet sayı olduğunu ve bu sayıların toplamının kaç olduğunu yazdırın

        int inputBaş=34;
        int inputBitiş=563;

        int sayaç=0;

        int toplam=0;



        for (int i = inputBaş; i <=inputBitiş ; i+=7) {

            System.out.println(i+ " ");
            sayaç++;
            toplam+=i;

        }

        System.out.println("");
        System.out.println("Toplam"+sayaç+"adet sayı var\nBusayıların toplamı:"+toplam);
    }
}
