package day03_dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        /*
        char data türünün ektra bir özelliği vardır
        eğer matematiksel bir işlemde char data türünden bir değer kullanırsanız char
        o işlemin matematiksel değerine göre sonuç döndürür.

         */

        System.out.println('a'+'b');//195

        System.out.println('a'-32);//65

        // 'a'-32 nin char olarak sonucu nedir

        System.out.println((char)('a'-32) );//A char daki değerindeki karşılığı verir

        //Kullanıcıdan bir char alıp ascii tableye kullanıcının girdiği
        // char ın sonrasındakı üç karakteri yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir char değer giriniz");
        char girilenKarakter=scan.next().charAt(0);

        System.out.println((char) (girilenKarakter+1) + ", "+
                (char) (girilenKarakter+2) + ", "+
                (char) (girilenKarakter+3) );



    }
}
