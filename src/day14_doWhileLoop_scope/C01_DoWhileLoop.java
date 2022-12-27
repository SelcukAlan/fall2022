package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        //Kullanıcıdan istediği kadar sayı alın
        //kullanıcı değer olaral  0'a basarsa işlemi bitirin

        int girilenSayi=10;
        int toplam=0;

        Scanner scan=new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("Lütfen toplanmak için bir tamsayı giriniz");
            girilenSayi=scan.nextInt();

            toplam+=girilenSayi;


        }

        System.out.println("girilen sayıların toplamı :" +toplam);

        /*
        while loop'un 2 tane negatif yönü vardır
        bu negatif yönler onu kullanılmaz yapacak büyüklükte değildir
        ancak bu negatifliklerden kurtulmak istersek do while loop kullanabiliriz




         */

    }
}
