package Methods;

public class E2PalindromeHw {

    // How would you check if String is palindrome or not?
    // aba=>true abbc=>false

    // Description of the Syntax:
    //void=Return type, isPalindrome= Method name, String word= Argument
    //String= Datatype, reverseWord= Variable
    // Palindrome= If a word is reversed and spelled/read exactly the same.
    // For Example, Madam, dad, mom, papa...
    void isPalindrome(String word){
        String reverseWord ="";
        //System.out.println(word.length());
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverseWord=reverseWord+word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println(" It's a Palindrome");
        }else{
            System.out.println("It's not Palindrome");
        }
}

    public static void main(String[] args) {
        E2PalindromeHw obj = new  E2PalindromeHw();
        obj.isPalindrome("MADAM");

    }


}
