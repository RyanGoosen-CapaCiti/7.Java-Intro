import java.util.Scanner;

public class Act3_Pos_Neg {
    public void checker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you would like to check: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Act3_Pos_Neg obj = new Act3_Pos_Neg();
        obj.checker();
    }
}
