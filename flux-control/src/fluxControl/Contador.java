package fluxControl;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int parameterOne = sc.nextInt();
		System.out.println("Enter the second number: ");
		int parameterTwo = sc.nextInt();
		
		try {
				counter(parameterOne, parameterTwo);
		} catch (InvalidParametersException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static void counter (int parameterOne, int parameterTwo) throws InvalidParametersException {
		
		if(parameterOne > parameterTwo) {
			throw new InvalidParametersException("The first number must be less than the second!");
		}
		int count = parameterTwo - parameterOne;
		for(int i = parameterOne; i <= parameterTwo; i++) {
			System.out.println(i);
		}
	}
}
