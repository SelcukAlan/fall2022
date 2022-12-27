package day13_methodOwerloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        //Kullanıcıdan toplamak üzere sayı alın girilen sayıların toplamı
        // 500 olur veya geçerse" Bu kadar sayı yeter"  deyip toplamı yazdırın

        //bu soruyu illa da for loop ile yapalım dersek adım sayısını tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayı=0;

        for (int i = 1; i <10000 ; i++) {
            System.out.println("toplamak üzere tamsayı giriniz");
            sayı=scan.nextInt();

            toplam +=sayı;

            if (toplam>=500){
                System.out.println("Bu kadar sayı yeter. Toplamları"+toplam+ "oldu");
                break;
            }
        }

        // aynı soruyu While loop ile yapalım
        toplam=0;
        sayı=0;
        while (toplam<500){

            System.out.println("toplamak üzere tamsayı giriniz");
            sayı=scan.nextInt();

            toplam+=sayı;
        }
        System.out.println("Bu kadar sayı yeter. Toplamları"+toplam+ "oldu");
    }
}
