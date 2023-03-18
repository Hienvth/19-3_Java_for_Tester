// package 4_SwitchCase;
import java.util.Scanner;


public class SwitchCaseDemo {
    public static void main(String[] args) {        
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter any number.");
        // nhập chuỗi
        // string day = str.nextLine();
        int day = str.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("None of the case satisfied");
        }
    }
}
