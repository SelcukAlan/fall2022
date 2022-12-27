package day09_stringManipulation;

public class C05_ındexOf {
    public static void main(String[] args) {

        String str="Java ile kodlama çok kolay";
        // str çok içeriyor mu?
        System.out.println(str.contains("çok"));//true

        // Kullanıcıdan aldığınız cümle "çok" ile başlayan ilk kelimeyi yazdırın

        System.out.println(str.indexOf('a'));// 1
        System.out.println(str.indexOf("v"));//2
        System.out.println(str.indexOf("çok"));//17 ==>Kelimenin ilk harfinin indexini verir
        System.out.println(str.indexOf("a", 5));//5 den sonra ilk a 13 deymiş

        //2. o'nun index'ini bulunuz
        //önce ilk o'nun index'ini buluruz sonra 2. o'yu aratırız

       int ilkOindexi= str.indexOf("o");//10
       int ikinciOindexi=str.indexOf("o",ilkOindexi+1);

        System.out.println(ilkOindexi+ " "+ikinciOindexi);//10 18

    }
}
