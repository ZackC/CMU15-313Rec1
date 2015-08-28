package game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameLogic {

	int numberToGuess;
	int maxValue = 1000;
	Scanner scan;

	public GuessingGameLogic(Scanner scan){
		this.scan = scan;
	}
	
	public GuessingGameLogic(Scanner scan, int maxValue){
		this.scan = scan;
		this.maxValue = maxValue;
	}

	public void guessingGame(){
		boolean stillPlaying = true;
		System.out.println("Guess the number between 0 and "+maxValue+".");
		Random rand = new Random();
		numberToGuess = rand.nextInt(maxValue+1);
		while(stillPlaying){
			int userInput = promptUser();
			if(numberToGuess < userInput){
				System.out.println("Too high. Guess again.");
			}else if(numberToGuess > userInput){
				System.out.println("Too low. Guess again");
			}else{
				System.out.println("You win!!!");
				stillPlaying = false;
			}
		}
	}

	public int promptUser(){
		System.out.print("Enter your guess: ");
		int input = -1;
		while(input == -1){
			try{
				input = scan.nextInt();
			}catch (IllegalStateException e){
				printErrorMessage();
			}
		}
		return input;
	}

	public void printErrorMessage(){
		System.err.println("Invalid input.  Please enter a valid integer value.");
	}

}
