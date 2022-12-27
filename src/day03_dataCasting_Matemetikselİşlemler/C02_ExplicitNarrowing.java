package day03_dataCasting_Matemetikselİşlemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
        Eğer geniş kapasiteli bir data türünden dar kapasiteli data türüne casting yapmak isterseniz java bunu
        otomatik olarak gerçekleştirmez sizden sorumluluk almanızı ister. Sizden işlemini gerçekleştirmek
        istediğiniz değerin önüne istediğimiz data türü yazılmalıdır.

         Explicit narrowing yapildiginda data kayiplari
         veya datanin beklenmedik bir sonuca donusmesi mumkundur.


         */

        double dbl=23.5;

        int sayı=(int)dbl;
        System.out.println(sayı);//ondalık kısmı atıp sadece 23 yazdırdı.

        byte byt=(byte) sayı;
        System.out.println(byt);//23

        sayı=130;
        byt=(byte) sayı;
        System.out.println("int 130'un byte hali:"+byt);//-126

        sayı=256;
        byt=(byte) sayı;
        System.out.println("int 255'in byte hali:"+byt);//0


    }
}
