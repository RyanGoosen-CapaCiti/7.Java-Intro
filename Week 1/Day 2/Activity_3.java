/* Write a Java program that accepts two integers from the user and then prints 
the sum, 
the difference, 
the product, 
the average, 
the maximum (the larger of the two integers), 
the minimum (smaller of the two integers)*/
import java.util.Scanner;

public class Activity_3 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int val1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int val2 = scanner.nextInt();

        if (val1 > val2) {
            max = val1;
            min = val2;
        }
        else {
            max = val2;
            min = val1;
        }

        System.out.println("The sum of the values are: "+ (val1 + val2));
        System.out.println("The difference of the values are: "+ (val1 - val2));
        System.out.println("The product of the values are: "+ (val1 * val2));
        System.out.println("The average of the values are: "+ ((val1 + val2)/2));
        System.out.println("The maximum of the values are: "+ (max));
        System.out.println("The minimum of the values are: "+ (min));

        scanner.close();
    }
}

