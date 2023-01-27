package it.develhope.stringhandling;
import java.lang.String;

public class Start {
    public static void main(String[] args) {
        String string1 = "United Kingdom";
        String string2 = "Germany";
        int index = string1.indexOf(' ');
        String sub1 = string1.substring(0,index).toUpperCase();
        String sub2 = string1.substring(index,14).toUpperCase();

        char[] charArray = (sub1 + " " + string2 + " " + sub2).toUpperCase().toCharArray();

        System.out.println(charArray);
    }
}


        // concatenate the strings, then convert them to uppercase and finally transform into a char[]
     
