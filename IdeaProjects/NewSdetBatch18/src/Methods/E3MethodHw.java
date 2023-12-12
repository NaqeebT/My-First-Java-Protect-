package Methods;

public class E3MethodHw {
    public static void main(String[] args) {

    // Swap two strings without using a third variable.

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping is  ");
        System.out.println("First String str1  " + str1);
        System.out.println("Second String str2  " + str2);
        // Swapping without a temporary variable
        str1 = str1 + str2;
        System.out.println(str1);
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swapping is ");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
}}
