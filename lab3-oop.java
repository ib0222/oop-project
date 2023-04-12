import java.util.Scanner;

public class DivisibleByTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = input.nextInt();

        System.out.println("Numbers divisible by 2:");
        for (int i = 2; i < n; i += 2) {
            System.out.print(i + " ");
        }
    }
}