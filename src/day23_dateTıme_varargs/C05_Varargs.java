package day23_dateTıme_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        //Verilen iki sayıyı toplayıp yazdıran bir method oluşturun

        topla(5,8);
        topla(5,7,3);
        topla(8,3,2);
        topla(7,3,4,7);



    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("dört sayinin toplamı:" +(sayi1+sayi2+sayi3+sayi4));//21
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("üç sayinin toplamı :"+ (sayi1+sayi2+sayi3));//15
    }

    private static void topla(int sayi1, int sayi2) {

        System.out.println("iki sayinin toplamı :" +(sayi1+sayi2));//13
    }
}
