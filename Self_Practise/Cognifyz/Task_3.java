package Self_Practise.Cognifyz;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task: Student Grade Calculator

        System.out.println("Enter the number of Grade :");
        int num_grade = scanner.nextInt();

        // Initialize variable for sum.
        double sum = 0;

        // Input each grade and calculate sum
        for (int i = 1; i <= num_grade; i++) {
            System.out.println("Enter " + i + " grade : ");
            double grade = scanner.nextDouble();
            sum = sum + grade;
        }

        // Calculate the average
        double average = sum / num_grade;

        // Display the average
        System.out.println("The average of grade is :" + average);
    }
}
