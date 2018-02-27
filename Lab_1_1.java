import java.util.*;

public class Lab_1_1 {
	public static void main(String[] a) {
		
		String lastName, firstName;
		int midterm, finalEx;
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNextLine()) {
			System.out.print("Enter last name: ");
			lastName = input.nextLine();
		
			System.out.print("Enter first name: ");
			firstName = input.nextLine();
		
			System.out.print("Enter midterm: ");
			midterm = input.nextInt();
	
			System.out.print("Enter final: ");
			finalEx = input.nextInt();
			
			
			System.out.println(lastName+", "+firstName+": "+(midterm+finalEx)/2);
		}
		
	}
}