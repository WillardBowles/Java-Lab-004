import java.util.Scanner;

public class SimpleMethod2 {
    public static int square(int num) {
        int result = num * num;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int squaredNum = square(num);
        System.out.println("Squaring " + num + " is: " + squaredNum);
    }
}