package Class2;

public class E1NestedLogics {
    public static void main(String[] args) {

        boolean isMainDoorOpened=true;
        boolean isRoom1Opened=false;
        boolean isRoom2Opened=true;

        if (isMainDoorOpened){
            if(isRoom1Opened) {
                System.out.println("We are in Room1");
            }else{
                System.out.println("Room1 is closed");


            }
        }
    }
}
