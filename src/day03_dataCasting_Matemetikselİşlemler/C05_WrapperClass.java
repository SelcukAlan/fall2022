package day03_dataCasting_Matemetikselİşlemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayı=10;
        String str="java candır";

        /*
      int primitive olduğundan hazır methodları yoktur

      String ise non-primitive olduğundan hazır metodlara sahiptir

      int, char, bolean gibi primitive variable türlerinde hazır metod kullanmak için
      Integer, Character, Boolean gibi Wrapperclasslar oluşturmuştur.


         */

        Integer sayı2=20;
        /*
        İşlemlerimizi yaparken bazen String olarak tanımlanmış ancak
        matematiksel içerik barındıran variableler görebiliriz.
        Bu durumda bu tür String variableleri sayıya çevirmek ihtiyacımız olabilir.

        Eğer sayıya çevirmek istediğimiz metinlerde harf veya sayı olmayan başka karakter varsa java hata verir.

         */
        String str3="123";
        String str4="254";
        System.out.println(str3+str4);//123254  java yanyana yazar.

        int str2Int=Integer.parseInt(str3);

        int str3Int=Integer.parseInt(str4);

        System.out.println(str2Int+str3Int);//377

        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Integer.MAX_VALUE);//2147483647

        char krk1='a';
        System.out.println(Character.isDigit(krk1));//False
        System.out.println(Character.isLetter(krk1));//True
        System.out.println(Character.isAlphabetic(krk1));//True

        short sayı3=4;

        int sayı5=sayı3;

        //Wrapper classlarda casting olmaz

        Short sayı6=45;

       // Integer sayı7=(Integer) sayı6;





    }
}
