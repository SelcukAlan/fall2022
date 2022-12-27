package day12_methodCreation;

public class C03_AsalSayı {
    public static void main(String[] args) {

        //Verilen bir sayının asal olup olmadığını true/false olarak döndüren bir method oluşturun

        //asalSayıMı methodu boolean bir sonuç verdiğinden bu methodu çalıştırdığımızda
        // ya direk yazdırmalıyız

        asalSayıMı(34);

        //veya method call'ın getireceği bir variable oluşturabiliriz

    }

    public static boolean asalSayıMı(int input){

        boolean asalSayıMı=true;

        for (int i = 2; i <input ; i++) {
            if (input%i==0){
                asalSayıMı=false;
                break;
            }
        }

        return asalSayıMı;

    }




}
