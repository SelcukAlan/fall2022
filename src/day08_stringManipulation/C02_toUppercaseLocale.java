package day08_stringManipulation;

import java.util.Locale;

public class C02_toUppercaseLocale {
    public static void main(String[] args) {

        String str="JAVA CANDIR";

        System.out.println(str.toLowerCase());//java candır

        str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);//java candır

        str="sevgi insanı hayta bağlar";
        str=str.toUpperCase();
        System.out.println(str);//SEVGİ İNSANI HAYTA BAĞLAR


    }
}
