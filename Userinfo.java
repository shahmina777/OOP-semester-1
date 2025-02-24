import java.util.Scanner;

public class Userinfo {

    static String USERNAME = "shahmina";
    static String PASSWORD = "8976";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.next();

        System.out.print("Enter password: ");
        String inputPassword = scanner.next();

        if (USERNAME.equals(inputUsername) && PASSWORD.equals(inputPassword)) {
            System.out.println("You entered correct password and username.");
        } else {
            System.out.println("You entered wrong password or username.");
        }

        scanner.close();
    }
}
