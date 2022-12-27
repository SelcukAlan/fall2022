package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Scanner scan=new Scanner( System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int ürünAdedi=scan.nextInt();

        System.out.println( "Lütfen ürünün liste fiyatını giriniz");
        double listeFiyatı=scan.nextDouble();

        System.out.println("Müşteri kartınız var mı? \n E : Evet H : Hayır");
        char kartVarmı= scan.next().charAt(0);

        if (kartVarmı=='E' && ürünAdedi>10){
            System.out.println("%20 indirimli toplam fiyat: "+ ürünAdedi*listeFiyatı*0.8);
        } else if (kartVarmı=='E'&& ürünAdedi>0) {
            System.out.println("%15 indirimli toplam fiyat :"+ ürünAdedi*listeFiyatı*0.85);
        } else if (kartVarmı=='H' && ürünAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat :"+ ürünAdedi*listeFiyatı*0.85);
        } else if (kartVarmı=='H' && ürünAdedi>0) {
            System.out.println("%10 inddirimli toplam fiyat :"+ ürünAdedi*listeFiyatı*0.9);
        }
        System.out.println("Hatalı bilgi");
    }
}
