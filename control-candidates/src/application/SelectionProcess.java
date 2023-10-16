package application;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {
	public static void main(String[] args) {
		String [] candidates = {"Bryan", "Alex", "Ever", "Marcos", "Emer"};
		for(String candidate : candidates) {
			contacting(candidate);
		}
//		printSelected();
//		analyzeCandidate(1900.0);
//		analyzeCandidate(2200.0);
//		analyzeCandidate(2000.0);
	}
	
	static void contacting(String candidate) {
		int attemptsMade = 1; 		//tentativas realizadas
		boolean keepTrying = true;  //continuar tentando
		boolean attended = false;   //atendeu
		
		do {
			attended = attended();
			keepTrying = !attended;
			if (keepTrying)
				attemptsMade++;
			else
				System.out.println("Contac made successfully!");
		} while(keepTrying && attemptsMade < 3);
		
		if(attended)
			System.out.println("We were able contac to " + candidate + " in " + attemptsMade 
					+ " attempt");
		else
			System.out.println("We couldn't contacted with " + candidate + ", number max of attempts " + attemptsMade);
	}
	
//	aux
	static boolean attended() {
		return new Random().nextInt(3)==1;
	}
	
	static void printSelected() {
		String [] candidates = {"Bryan", "Alex", "Ever", "Marcos", "Emer"};
		System.out.println("Printing the list of candidates informing the index of the element!");
		for (int indice = 0; indice < candidates.length; indice++) {
			System.out.println("The cantidade n " + indice + " e " + candidates[indice]);
		}
		System.out.println("Abbreviated form of intercation for each");
		
		for(String candidate : candidates) {
			System.out.println("Th candidate selected was " + candidate);
		}
	}
	
	static void selectionCandidates() {
		String [] candidates = {"Bryan", "Alex", "Ever", "Marcos", "Emer", "Vitor", "Paulo", "Joao", " Cristian"};
		
		int selectedCandidates = 0;
		int currentCandidate = 0;
		double baseSalary = 2000.0;
		DecimalFormat df = new DecimalFormat("#.##");
		
		while(selectedCandidates < 5 && currentCandidate < candidates.length) {
			String candidate = candidates[currentCandidate];
			double desiredSalary = desiredSalary();
			String formattedSalary = df.format(desiredSalary);
			
			System.out.println("The candidate " + candidate + " requested this salary amount " + formattedSalary);
			if (baseSalary > desiredSalary) {
				System.out.println("The candidate " + candidate + " was selected for the vacancy!");
				selectedCandidates++;
			}
			currentCandidate++;
		}
	}
	
	static double desiredSalary() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analyzeCandidate(double desiredSalary) {
		double baseSalary = 2000.0;
		if (baseSalary > desiredSalary) {
			System.out.println("Call the candidate!");
			
		} else if (baseSalary == desiredSalary) {
			System.out.println("Call the candidate with a counter-propose!");
		} else {
			System.out.println("Waiting for the result of the other candidates!");
		}
	}
}
