package it.develhope.stringhandling;
import java.lang.String;

public class Start {
    public static void main(String[] args) {
        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring(0,6).toUpperCase();
        String sub2 = string1.substring(7,14).toUpperCase();
        String concatenatedString = sub1 + " " + string2 + " " + sub2;
        concatenatedString = concatenatedString.toUpperCase();

        char[] charArray = concatenatedString.toCharArray();

        System.out.println(charArray);
    }
}


        // concatenate the strings, then convert them to uppercase and finally transform into a char[]
     
