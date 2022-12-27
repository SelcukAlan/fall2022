package day10_stringManipulation;

public class C08_ForLoop {
    public static void main(String[] args) {
        // 1 İle 1000 arasındaki sayıaları yanyana yazdırın
        // yazdırma işlemi bittiğinde tüm bu sayıların toplamını= deyip toplamı yazdırın

        int sayılarınToplamı=0;

        for (int i = 1; i <=1000 ; i++) {

            System.out.print(i+" ");
           // sayılarınToplamı=sayılarınToplamı+i;

            sayılarınToplamı+=i;
        }

        System.out.println("");
        System.out.println("sayıların toplamı ="+ sayılarınToplamı);
    }
}
