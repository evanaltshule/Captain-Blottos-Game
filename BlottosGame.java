import java.util.Scanner;

public class BlottosGame{
	public boolean start(){
		int a, b, c, d, current;
		intro();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of players on the first battlefield: ");
		while(true){
			a = Integer.parseInt(s.nextLine());
			if(a <= 100){
				break;
			}
			System.out.println("You only have 100 troops!");
			System.out.print("Enter the number of players on first battlefield: ");
		}
		current = 100 - a;
		System.out.print("Enter the number of players on the second battlefield: ");
		while(true){
			b = Integer.parseInt(s.nextLine());
			if((a + b) <= 100){
				break;
			}
			System.out.println("You only have " + current + "troops remaining.");
			System.out.print("Enter the number of players on second battlefield: ");
		}
		current = current - b;
		System.out.print("Enter the number of players on the third battlefield: ");
		while(true){
			c = Integer.parseInt(s.nextLine());
			if((a + b + c) <= 100){
				break;
			}
			System.out.println("You only have " + current + "troops remaining.");
			System.out.print("Enter the number of players on third battlefield: ");
		}
		current = current - c;
		System.out.print("Enter the number of players on the fourth battlefield: ");
		while(true){
			d = Integer.parseInt(s.nextLine());
			if((a + b + c + d) <= 100){
				break;
			}
			System.out.println("You only have " + current + "troops remaining.");
			System.out.print("Enter the number of players on fourth battlefield: ");
		}
		Player player = new Player(a,b,c,d);
		cpu computer = new cpu();
		computer.generateFields();
		int result = battle(player, computer);
		if(result == 1){
			System.out.println("You won!");
		}
		else if(result == -1){
			System.out.println("The computer won!");
		}
		else{
			System.out.println("It's a draw!");
		}
		return true;
	}

	public void intro(){
		System.out.println("Welcome to Captain Blotto's Game!");
		System.out.println("You have 100 troops and there are three battlefields.");
		System.out.println("You win a battle if you put more troops on your");
		System.out.println("battlefield than your opponent.");
	}

	public int battle(Player p, cpu c) {
		int cpuCount = 0;
		int playerCount = 0;
		int difference;
		if(p.getFieldA() > c.getFieldA()){
			difference = p.getFieldA() - c.getFieldA();
			System.out.println("You defeated the computer on battlefield 1 by " + difference + "troops!");
			playerCount++;
		}
		else if(p.getFieldA() < c.getFieldA()){
			System.out.println("The computer defeated you on battlefield 1 with " + c.getFieldA() + " troops!");
			cpuCount++;
		}
		else{
			System.out.println("It's a tie on battlefield 1!");
		}
		try{
			Thread.sleep(1000);
		} catch(InterruptedException e){}
		if(p.getFieldB() > c.getFieldB()){
			difference = p.getFieldB() - c.getFieldB();
			System.out.println("You defeated the computer on battlefield 2 by " + difference + " troops!");
			playerCount++;
		}
		else if(p.getFieldB() < c.getFieldB()){
			System.out.println("The computer defeated you on battlefield 2 with " + c.getFieldB() + " troops!");
			cpuCount++;
		}
		else{
			System.out.println("It's a tie on battlefield 2!");
		}
		try{
			Thread.sleep(1000);
		} catch(InterruptedException e){}
		if(p.getFieldC() > c.getFieldC()){
			difference = p.getFieldC() - c.getFieldC();
			System.out.println("You defeated the computer on battlefield 3 by " + difference + " troops!");
			playerCount++;
		}
		else if(p.getFieldC() < c.getFieldC()){
			System.out.println("The computer defeated you on battlefield 3 with " + c.getFieldC() + " troops!");
			cpuCount++;
		}
		else{
			System.out.println("It's a tie on battlefield 3!");
		}
		try{
			Thread.sleep(1000);
		} catch(InterruptedException e){}
		if(p.getFieldD() > c.getFieldD()){
			difference = p.getFieldD() - c.getFieldD();
			System.out.println("You defeated the computer on battlefield 4 by " + difference + " troops!");
			playerCount++;
		}
		else if(p.getFieldD() < c.getFieldD()){
			System.out.println("The computer defeated you on battlefield 4 with " + c.getFieldD() + " troops!");
			cpuCount++;
		}
		else{
			System.out.println("It's a tie on battlefield 4!");
		}
		try{
			Thread.sleep(1000);
		} catch(InterruptedException e){}
		if(cpuCount > playerCount){
			return -1;
		}
		if(cpuCount < playerCount){
			return 1;
		}
		else{
			return 0;
		}
	}
}