package day09_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "candır";
        System.out.println(str1+ " "+ str2);//Java candır
        System.out.println(str1.concat(str2));//Javacandır
        System.out.println(str1.concat(" ").concat(str2));//Java candır

    }
}
