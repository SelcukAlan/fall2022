package day18_arrayList;

import day16_arrays.C10_ArrayeYeniElemnetEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        String[] arr={"A","B","T"};

        //bu array e element olarak C elementini ekleyelim

       arr= C10_ArrayeYeniElemnetEkleme.arrayeElementEkleme(arr,"C");

        System.out.println(Arrays.toString(arr));//[A, B, T, C]


        //Arraylist esnek uznlıktaki bir arraydir
        //Ancak ArrayList altyapısını kullandığından
        //elementleri sadece tek tek ekleyebiliriz


        List<String> harfler=new ArrayList<>();

        System.out.println(harfler);//[]

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);//[A, B, K]

        harfler.add(1,"C");

        System.out.println(harfler);//[A, C, B, K]==> B ile K arasına D ekleyelim

        harfler.add(3,"D");

        System.out.println(harfler);//[A, C, B, D, K]

        harfler.addAll(harfler);
        System.out.println(harfler);//[A, C, B, D, K, A, C, B, D, K]

        List<String>  karakterler=new ArrayList<>();
        karakterler.add("*");
        karakterler.add("/");

        harfler.addAll(karakterler);

        System.out.println(harfler);//[A, C, B, D, K, A, C, B, D, K, *, /]






    }
}
