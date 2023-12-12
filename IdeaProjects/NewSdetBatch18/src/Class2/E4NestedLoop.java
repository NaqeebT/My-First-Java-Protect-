package Class2;

public class E4NestedLoop {
    public static void main(String[] args) {
        // java always execute from top to bottom and left to right.

        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 5; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
