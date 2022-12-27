package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen başlangıç ve bitiş değerleri için 2 pozitif tamsayı giriniz");
        int başlangıç=scan.nextInt();
        int bitiş=scan.nextInt();

        if (bitiş<başlangıç){
            System.out.println("başlangıç değeri bitiş değerinden küçük olmalı");
        }else {
            int toplam=0;
            for (int i = başlangıç; i <=bitiş ; i++) {

                toplam+=i;//tüm sayıları sırası ile toplama ekledik
            }
            System.out.println(başlangıç+ "ile"+bitiş+"arasındaki sayıların toplamı:"+toplam);
        }

    }
}
