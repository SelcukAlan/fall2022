package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {

        //Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        // liste olarak dondurecek bir method olusturun.

        List<String> isimlerListesi=isimListesiOluştur();
        System.out.println(isimlerListesi);

    }

     public static List<String> isimListesiOluştur(){
        List<String> isimListesi=new ArrayList<>();
        String girilenİsim="";
         Scanner scan=new Scanner(System.in);

         while (!girilenİsim.equalsIgnoreCase("q")){
             System.out.println("Listeye eklemek için bir isim girin \n Bitirmek içim Q'ya basın");
             girilenİsim=scan.nextLine();

             if (!girilenİsim.equalsIgnoreCase("Q")){
                 isimListesi.add(girilenİsim);
             }
         }

        return isimListesi;

    }



}
