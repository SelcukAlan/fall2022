package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde
        // hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String girilenGün=scan.next();
        String kullanılacakGün=girilenGün.toLowerCase();


        /*
        String ifadeler case sensitive'dir kullanıcının Pazar, PAzar, PazaR... gibi
         çok farklı şekilde yazma ihtimali var

         */

        switch (kullanılacakGün){
            case "pazartesi":
                System.out.println(girilenGün +":"+ "çalışma zamanı, tatile 5 gün var");
                break;
            case "salı":
                System.out.println(girilenGün + ":"  +"çalışma zamanı, tatile 4 gün var");
                break;
            case "çarşamba":
                System.out.println(girilenGün + ":"  + "çalışma zamanı, tatile 3 gün var");
                break;

            case "perşembe":
                System.out.println(girilenGün +  " :" + "çalışma zamanı, tatile 2 gün var");
                break;
            case "cuma":
                System.out.println(girilenGün + ":"  + "çalışma zamanı, tatile 1 gün var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println(girilenGün + ":"+ "şimdi dinlenme zamanı");

                break;
        }

    }
}
