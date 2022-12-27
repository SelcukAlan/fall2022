package day10_stringManipulation;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1="";
        String str2="    ";
        String str3;
        String str4=null; //str4 null a eşit değildir null olarak işaretlenmiştir.

        System.out.println(str1.length());//0
        System.out.println(str2.length());//4

        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false

        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true

        //null bir değer değil; işaretçidir.
        //null pointer: non primitive bir objenin oluşturulduğunu ancak
        //              bilinçli olarak değer atanmadığını işaretler.
        //              str4 ün değeri null dır cümlesi yanlış olur
        //              doğrusu str4 null olarak işaretlenmiştir

       // System.out.println(str3.length());
       //System.out.println(str3.concat("Ali Can"));
       // System.out.println(str3.substring(3, 4));
        /*
        Java bir variableyi oluşturup değer atanmamasına izin verir
        bir variableyi değer atamadan oluşturabilirsiniz ancak kullanamazsınız
        değer atanmayan bir variableyi kullanmaya kalkarsanız java CTE verir.


        null pointer ise bu variable ye bir değer atanmadığını ve bunun bilinçli bir tercih
        olduğunu java ya soyler

         */
        str4=null;

       // System.out.println(str4.length());//NullPointerException
       // System.out.println(str4.substring(3, 4));//NullPointerException

        System.out.println(str4);//null
        System.out.println(str4+"Ali Can");//nullAli Can
        System.out.println(str4.concat("Ali Can"));//nullAli Can



    }
}
