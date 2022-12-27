package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {

        List<String> harf=new ArrayList<>();

        harf.add("A");
        harf.add("Z");
        harf.add("T");

        System.out.println(harf.remove("Z"));//true
        System.out.println(harf);//[A, T]

        System.out.println(harf.remove(0));  // A  //0'incı indexdeki elementi siler ve
                                                // görevi tamalayıp silinen elementi bize döndürür
        System.out.println(harf);//[T]

        List<String> yeniList=new ArrayList<>();

        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");
        System.out.println(yeniList.removeAll(harf));//true

        System.out.println(yeniList);//[C, D]


    }
}
