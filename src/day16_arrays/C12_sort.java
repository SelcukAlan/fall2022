package day16_arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        //Verilen bir array'i Natural Order'a (dogal sıralama) göre sıralayınız.


        String[] isimler={"Hüseyin", "Yusuf", "Mehmet", "Akile", "Said"};
        System.out.println(Arrays.toString(isimler));//[Hüseyin, Yusuf, Mehmet, Akile, Said]

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Akile, Hüseyin, Mehmet, Said, Yusuf]

        //Eğer büyükten küçüğe sıralamak istersek önce sort kullanarak natural Ordera göre sıralar sonra geçici bir
        //array kullanarak sıralamayı terse çeviririz.

    }
}
