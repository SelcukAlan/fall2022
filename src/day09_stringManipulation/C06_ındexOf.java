package day09_stringManipulation;

import java.util.Scanner;

public class C06_ındexOf {
    public static void main(String[] args) {

        //Kullanıcıdan aldığımız cümle "çok" ile başlayan ilk kelimeyi yazdırın
        // cümlede çok kelimesi geçmiyorsa "cümlede çok ile başlayan cümle yoktur" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String girilenCümle=scan.nextLine();

        //Sınavlarımızda çoktan seçmeli soruları kullanıyoruz
        //Javayı çok seviyoruz
        //Bu kadar çoklu seçenek olur mu?

        if (!girilenCümle.contains("çok")){
            System.out.println("çümlede çok ile başlayan kelime yok");
        }else {

            int çokIndexi= girilenCümle.indexOf("çok");
            int boşlukIndexi=girilenCümle.indexOf(" ",çokIndexi);

            System.out.println(girilenCümle.substring(çokIndexi, boşlukIndexi));


        }


    }
}
