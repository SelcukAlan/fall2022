package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_arrayList {
    public static void main(String[] args) {

       // Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum
       // pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Tam bölenlerini listelemek için pozitif bir tamsayı girin");
        int girilenSayi=scan.nextInt();


        if (girilenSayi<=0){
            System.out.println("Geçersiz sayi");
        }else {
            List<Integer>tamBolenlerListesi=tamBolenlerListesiOluştur(girilenSayi);
            System.out.println(tamBolenlerListesi);
        }


    }

    public static List<Integer> tamBolenlerListesiOluştur(int girilenSayi){
        List<Integer>tamBolenlerListesi=new ArrayList<>();

        for (int i = 1; i <girilenSayi ; i++) {
            if (girilenSayi%i==0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;

    }




}
