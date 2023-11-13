import java.util.Scanner;

public class LargestOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of natural numbers: "); // Ask the user how many numbers they want to compare
        int n = scanner.nextInt(); // Store the user's answer in 'n'
        
        int largest = Integer.MIN_VALUE;  // Initialize the largest number to the smallest possible value
        
        for (int i = 0; i < n; i++) { // Loop 'n' times to get 'n' numbers from the user
            System.out.print("Enter a natural number: "); // Ask the user to enter a number
            int num = scanner.nextInt(); // Store the entered number in 'num'
            
            if (num > largest) { // Compare the entered number with the current largest number
                largest = num; // If the entered number is larger, update the largest number
            }
        }
        
        System.out.println("The largest number is: " + largest); // Display the largest number
        scanner.close(); // Close the input scanner to free up resources
    }
}
