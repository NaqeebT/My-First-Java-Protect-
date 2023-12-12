package StringClass;

public class E1NewTaskString {
    public static void main(String[] args) {

        // Create a String that will hold a sentence.
        // Write a program to get a new String without any space.

        String str="I am very happy today!";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);


    // Create a String that should be combination of letters, numbers, special characters.
        // Find out how many Alphabets(abd AZ) characters are there in the String.

        String combo="jhdfasklgsdaSDFGFH3233445#@$%%$&*";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
