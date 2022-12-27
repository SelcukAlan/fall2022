package day09_stringManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayı iyi öğrenmek için çok çalışmak lazım çok";

         //İlk a nı indexini yazdırınız

        System.out.println(str.indexOf("a"));//1

        //son a nın indexini yazdırın

        System.out.println(str.lastIndexOf("a"));//39 ==> index her daim baştan sayılarak bulunur

        //Verilen str da çok kelimesinin kullanımını kontrol edip
        //kullanılmamış çok kelimesi
        //bir kere kullanılmış
        //birden fazla kullanılmış
        // sonuçlarından uygun olanının yazdırın

        int ilkÇokındexi=str.indexOf("çok");
        int sonÇokIndexi=str.lastIndexOf("çok");


        if (!str.contains("çok")){
            System.out.println("çok kelimesi kullanılmamış");
        } else if (ilkÇokındexi==sonÇokIndexi) {
            System.out.println("çok kelimesi bir kere kullanılmış");
        }else {
            System.out.println("çok kelimesi birden fazla kullanılmış");
        }


    }
}
