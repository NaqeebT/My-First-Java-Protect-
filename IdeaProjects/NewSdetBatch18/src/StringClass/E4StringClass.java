package StringClass;

public class E4StringClass {
    public static void main(String[] args) {

       // Count how many times letter a has appeared in the bellow String?

        String str="Java is a fun class";
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
