package day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str="Java güzeldir";// 13 tane karakter barındırır.

        //Javada index 0 dan başlar
        //J==>0.index, r==>12.index
        //charAt (index) ile istediğimiz indexdeki char'a ulaşabiliriz

        //ilk a'yı yazdıralım

        System.out.println(str.charAt(1));

        //sondan ikinci harfi yazdıralım

        System.out.println(str.charAt(13-2));//karakter sayısı -2. indexdeki eleman

        //sondan 4. karakteri büyük harf olarak yazdırın

        System.out.println(str.toUpperCase().charAt(13-4));

        //charAt methodu bize char döndürdüğü için toUpperCase çalışmaz
        //String methodlarını charAt ile kullanmak isterseniz charAt() den önce kullanmalısınız.

        //System.out.println(str.charAt(13));//String index sınırların dışında hatası verir.


    }
}
