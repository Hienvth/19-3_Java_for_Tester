import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] );
        }
        String strArr = Arrays.toString(arr);
        System.out.println("Array elements are: " + strArr);
    }
}

