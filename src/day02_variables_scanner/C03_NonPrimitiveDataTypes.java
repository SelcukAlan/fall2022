package day02_variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {

        String str="Java candır";
        int sayı=10;

        // Primitive data türlerinin hazır methodları yoktur
        //ancak non-primitive data türlerinin bizim kullanabileceğimiz methodları vardır.

        System.out.println(sayı);//10

        System.out.println(str.toLowerCase());//java candır  ==> sadece yazılan satır için anlık değiştirir

        System.out.println(str.toUpperCase());//JAVA CANDIR

        System.out.println(str);//java candır

        System.out.println(str.isEmpty());//false


    }
}
