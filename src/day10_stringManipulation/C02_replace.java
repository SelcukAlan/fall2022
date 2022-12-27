package day10_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java öğren , adana ye :)";

        System.out.println(str.replace('a', 'A'));//JAvA öğren , AdAnA ye :)

        System.out.println(str.replace(" ",""));//Javaöğren,adanaye:)

        System.out.println(str.replace("Java", "Yazılım")); //Yazılım öğren , adana ye :)

        String telefon="555 3245887";

        System.out.println(telefon.replace("555", "587"));//587 3245887

        System.out.println(telefon.replace("2", "7"));//555 3745887

        //Aşağidaki arama sonucunun 10000 den fazla olduğunu test edin

        String sonuç="1-16 of over 100,000 results for “apple”";

        int indexOver=sonuç.indexOf("over");
        int indexResults= sonuç.indexOf("results");

        String sonuçSayısıStr=sonuç.substring(indexOver+5,indexResults-1);
        System.out.println(sonuçSayısıStr);//100.000

        sonuçSayısıStr=str.replace(",","");//virgülü yok et

        System.out.println(sonuçSayısıStr);//100000

        int sonuçSayısıInt=Integer.parseInt(sonuçSayısıStr);

        if (sonuçSayısıInt>100000){
            System.out.println("arama sonucu PASSED");
        }else {
            System.out.println("arama sonuç testi Failed");
        }


    }
}
