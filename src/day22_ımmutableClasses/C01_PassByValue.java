package day22_ımmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        // verilen bir List'de degisiklik yapan 2 method olusturun
// 1.method list'in elementlerine yeni deger atayip yazdirsin
// 2.method, list'e yeni bir list degeri atayip, yeni list'e
//   elementler ekleyip yazdirsin
// her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);//[10, 34, 45]

        elemanlarıDegiştir(sayilar);

        System.out.println("1. method call'dan sonra :" +sayilar);//[25, 54, 67]

        yeniListAta(sayilar);

        System.out.println("2. method call'dan sonra sayılar :" +sayilar);//[25, 54, 67]


        /*
        Java PassByValue kullanır
        PassByValue demek methoda gönderilen variablenin kendisini değil degerini göndermek demektir
        Primitive data türleri veya String gönderdiğimizde methodda yapılan değişiklik methodda kalır
        yani main method'da atama yapılmadıkça main method'daki değer değişmez

        Passbyvalue çoklu elemt içeren array ve list gibi yapılar için de geçerlidir
        ancak çoklu elementi value olarak method'a göndermediğinden array veya List'in adresini gönderir

         */

    }

public static void elemanlarıDegiştir(List<Integer> sayilar){
    sayilar.set(0,25);
    sayilar.set(1,54);
    sayilar.set(2,67);
    System.out.println("elemanları değiştir metodunda List :" +sayilar);//[25, 54, 67]

}
public static void yeniListAta(List<Integer>sayılar){

        sayılar=new ArrayList<>();
        sayılar.add(34);
        sayılar.add(98);
        sayılar.add(11);

    System.out.println("Yeni list ata methodundan sayılar Listin son hali :" +sayılar);//[34, 98, 11]


}


}
