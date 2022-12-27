package day03_dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class C08_SayınınRakamlarToplamınıBulma {
    public static void main(String[] args) {

        //Kullanıcıdan dört basamaklı bir tamsayı alın sayının rakamlar toplamını bulun

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen dört basamaklı  pozitif bir tamsayı giriniz");

        int girilenSayı=scan.nextInt();//2457 olsun

        //soru için lazım olan variableleri ekleyelim

        int birlerBasamağı=0;

        int rakamlarToplamı=0;

        //sırasıyla her bir basmağı elde edip rakamlar toplamına ekleyelim

        birlerBasamağı=girilenSayı%10;//7
        rakamlarToplamı=rakamlarToplamı+birlerBasamağı;//0+7
        girilenSayı=girilenSayı/10;//245

        birlerBasamağı=girilenSayı%10;//5
        rakamlarToplamı=rakamlarToplamı+birlerBasamağı;//7+5=12
        girilenSayı=girilenSayı/10;//24

        birlerBasamağı=girilenSayı%10;//4
        rakamlarToplamı=rakamlarToplamı+birlerBasamağı;//4+12=16
        girilenSayı=girilenSayı/10;//2

        birlerBasamağı=girilenSayı%10;
        rakamlarToplamı=rakamlarToplamı+birlerBasamağı;//16+2=18
        girilenSayı=girilenSayı/10;//0
        System.out.println("girilen sayının rakamlar toplamı:"+rakamlarToplamı);











    }
}
