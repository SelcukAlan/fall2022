package day12_methodCreation;

public class C2_MethodOluşturma {
    public static void main(String[] args) {

        //verilen 2 sayıyı çarpıp sonucu yazdıran bir method oluşturun
        //bir method ancak method call yapıldığında çalışır
        //method call için method adı ve parametrelere göre argument yazılmalıdır
        //method call içerisinde yazılan değerlere argument denir

        çarpYazdır(5,8);
        çarpYazdır(7.4 , 8.6);
    }

    public static void çarpYazdır(double sayı1,double sayı2){

        System.out.println(sayı1 * sayı2);


    }



}
