package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        //verilen bir metnin palindrom olup olmadığını yazdırın
        //palindrome:düz okunuşu ile ters okunuşu aynı olan


        String str="Bu methodlar ne güzelmiş";

        String tersStr=C07_TerseÇevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("verilen metin palindrome");
        }else {
            System.out.println("verilen metin palindrome değil");
        }

    }
}
