package day16_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //Verilen bir String arrayın tüm elemetlerini yazdırın

        String[] isimler={"Hüseyin", "Yusuf", "Mehmet", "Akile", "Said"};

        System.out.println(Arrays.toString(isimler));//[Hüseyin, Yusuf, Mehmet, Akile, Said]

        for (int i = 0; i <isimler.length ; i++) {

            System.out.print(isimler[i] + " ");//Hüseyin Yusuf Mehmet Akile Said
        }


    }
}
