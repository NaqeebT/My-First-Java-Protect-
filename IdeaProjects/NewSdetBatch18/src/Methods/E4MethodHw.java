package Methods;

public class E4MethodHw {
    //    //  Create a method createEmail(). Based on values of users firstName, lastName
    //   and email type, your method should return complete email
    //   Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    void createEmail(String fName, String lName, String emailtype) {
        System.out.println(fName + lName + "@" + emailtype + ".com");
    }

    public static void main(String[] args) {
        E4MethodHw obj = new E4MethodHw();
        obj.createEmail("naqeeb_","totakhil","yahoo");

    }
}