package day07_ternary_switchStatements;

public class C06_Sorular {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
        //50’den kucukse "Maalesef kaldin" yazdirin.
        int input=54;

        System.out.println(input>=50 ? "Sınıfı geçtin":"Malesef kaldın");

        //- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu
        // buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        char karakter= 'a';

        System.out.println(karakter>='a'&&karakter<='z' ?(char)  (karakter-32): karakter);

        //Kullanıcıdan bir sayı alın ve mutlak değerini yazdırın

         input=15;

         // Mutlak değerde sonuç pozitif çıkması gerekir
         //   |5| => 5   |-4| => (-1)*(-4) =>4

        System.out.println(input>0 ? input : (-1)*input);


    }
}
