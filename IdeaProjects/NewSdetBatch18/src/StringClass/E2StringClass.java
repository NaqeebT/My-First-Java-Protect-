package StringClass;

public class E2StringClass {

    public static void main(String[] args) {

       /* Store username, password and confirm password from a user and check following requirements:

        Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Psassword cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “ Your username and password has been created”
         */





        String userName = "Naqeeb";
        String password = "Totakhil123";
        String confirmPassword = "Totakhil123";
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");

            }else if(password.length()<8) {
            System.out.println("password is too short");
        }else if(password.contains(userName)) {
            System.out.println("Password cannot contain userName");

        }else if(!password.equals(confirmPassword)) {

            System.out.println("Passwords do not match");
        }else
            System.out.println("Your username and password has been created");
    }
}