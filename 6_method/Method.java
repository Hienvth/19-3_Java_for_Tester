// package 6_method;
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        scanner.close();

        checkLogin(username, password);
    }

    public static void checkLogin(String username, String password) {
        if (username.equals("HienVT") && password.equals("thehien0801")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed, please check your login information!");
        }
    }
}
