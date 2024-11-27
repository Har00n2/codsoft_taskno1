import java.util.Scanner;
import java.util.Random;
public class guessNumber {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String rePlay = "yes";
		do
		{
			int round = 0;
			int score = 0;
			int maxRound = 6;
			int usrInput;
			Boolean guessed = false;
			Random random = new Random();
			int rand = random.nextInt(100) + 1;;
			System.out.println("Welcome to the number Guessing Game!");
			System.out.println();
			System.out.println("You have to guess a number between 1 and 100, you have a total of "+maxRound+" Rounds");
			System.out.println();
			while(round<maxRound) {
				System.out.print("Enter the number: ");
				usrInput = sc.nextInt();
				if(usrInput == rand) {
					round++;
					score = (maxRound - round + 1); //based on how quickly user guesses the number
					System.out.println("Congratulations! You have guessed the right number in "+round+" Round with the score of "+ score);
					System.out.println();
					guessed = true;
					break;
				}
				
				else if(rand>usrInput) {
					round++;
					System.out.println("Low! Guess a higher number");
					System.out.println();
					System.out.println("Remaining rounds: "+ (maxRound-round) );
				}
				else {
					round++;
					System.out.println("high! Guess a lower number");
					System.out.println();
					System.out.println("Remaining rounds: "+ (maxRound-round) );
				}
			}
			
			if(round==maxRound && guessed == false) {
				System.out.println();
				System.out.println("You have reached your maximum number of rounds, your score was " + score );
				System.out.println("The number was "+rand);
				
			}

			System.out.print("Do you want to play again?(yes/no): ");
			rePlay = sc.next();
			
			
		}while(rePlay.equalsIgnoreCase("yes"));
		
		System.out.println("--------------------------------------------------------------The Game Ends---------------------------------------------------------------------------");
		sc.close();

	}

}
