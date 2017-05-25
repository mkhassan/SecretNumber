

import java.util.Random;
import java.util.Scanner;


public class SecretNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		
		
		Random r = new Random();
		int x = 1 + r.nextInt(100);
		System.out.println("Random number " + x);
		
		while(!(n==x)) {
		
		
		 if(n < x){
			System.out.println("You guessed so low, try again");
		}
			
		else {
				System.out.println("You guessed so high, try again");
			}
		 
		 
			System.out.println("Enter a number: ");
			n = reader.nextInt();
		}

		
		
		System.out.println("You got it right!");
	}
}


