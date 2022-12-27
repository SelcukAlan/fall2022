package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {
        //Javada bir çok yapıda get ve set methotları bulunur ve fazlaca kullanırız
        //get methodları bilgiyi bize getirirken
        // set methodları bilgiyi günceller (uppdate)

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler);//[A, Z, T]

        //2.index'e F harfini ekleyin

        harfler.add(2,"F");
        System.out.println(harfler);//[A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler);//[A, Z, M, T]

        //set methodu var olan elementin değerini güceller, eleman sayısını artırmaz.


    }
}
