
import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter how many numbers: ");
		int n = sc.nextInt();

		int[] numbers = new int[n];

		System.out.print("Enter the numbers:");
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		int largest = numbers[0]; 
		int secondLargest = numbers[0]; 

		for (int num : numbers) {
			if (num > largest) {
				secondLargest = largest;
				largest = num; 
			} else if (num > secondLargest && num != largest) {

				secondLargest = num;
			}
		}
		System.out.println("Second largest number is: " + secondLargest);

		sc.close();
	}
}
