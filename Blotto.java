import java.util.Scanner;
import java.util.Random;

public class Blotto{
	public static void main(String[] args){
		BlottosGame blotto = new BlottosGame();
		Scanner s = new Scanner(System.in);
		boolean decision = true;
		String response;
		while(decision){
			blotto.start();
			System.out.print("Would you like to play again? (y/n)");
			response = s.nextLine();
			if(response.equals("n") || response.equals("no")){
				decision = false;
			}
		}
	}
}