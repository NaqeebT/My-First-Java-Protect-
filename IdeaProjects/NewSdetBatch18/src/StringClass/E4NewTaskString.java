package StringClass;

public class E4NewTaskString {
    public static void main(String[] args) {

  // How would you check if String is Palindrome or not?
  // aba=>true and abbc=> false

  // This is an interview question:

  String str="Mom";
        String reversedWord="";
        for (int i = str.length()-1; i>=0; i--) {
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }

    }
}
