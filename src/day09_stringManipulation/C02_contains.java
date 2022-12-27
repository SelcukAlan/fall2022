package day09_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java öğren mutlu ol";

        // str mutlu içeriyor mu?

        System.out.println(str.contains("mutlu"));//true

        // charSquence: char dizisi


        System.out.println(str.contains("j"));//false
        System.out.println(str.contains(" "));//true

        //contains metodu kaç tane olduğuna değil sadece var olup olmadığına bakar.

        System.out.println(str.contains("java") && str.contains("mutlu"));


    }
}
