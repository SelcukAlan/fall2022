package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        //3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        int yaş=scan.nextInt();

        System.out.println("isminiz:"+isim+
                "\nsoyisminiz:"+soyisim+
                "\nyaş:"+yaş+
                "\nkaydınız başarıyla tamamlanmıştır");// \n alt satırdan devam etmenizi sağlar



    }
}
