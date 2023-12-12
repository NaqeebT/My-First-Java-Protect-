package StringClass;

public class E3NewTaskString {
    public static void main(String[] args) {

  // How would you reverse a String word by word?
  // Input=> This is sentence I want to reverse
  // Output=> sihT si ecnetnes I tnaw ot esrever


        String str="This is sentence I want to reverse";
        String [] words=str.split(" ");

        for (String w:words){

            for (int i = w.length()-1; i>=0; i--) {
                System.out.print(w.charAt(i));
            }
            System.out.print(" ");


        }

    }
}
