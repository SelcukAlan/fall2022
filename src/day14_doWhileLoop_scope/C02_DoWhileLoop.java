package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan istediği kadar sayı alın
        //kullanıcı değer olaral  0'a basarsa işlemi bitirin

        int girilenSayi=0;
        int toplam=0;

        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Lütfen toplanmak için tamsayı giriniz");
            int girilenSayı=scan.nextInt();
            toplam +=girilenSayı;

        }while (girilenSayi!=0);

        System.out.println("girilen sayıların toplamı :" +toplam);




    }
}
