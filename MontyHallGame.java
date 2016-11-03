
import java.util.Scanner;



public class MontyHall
{

	public static void main(String[] args)
	{
	welcome();
	gameManager();
	}

	public static void welcome()
	{
		System.out.println("Welcome to the Monty Hall Game!");
		System.out.println("Please pick a door number between 1 and 3.");
		System.out.print("One door will be revealed after you do so and you will have a chance to switch doors.");
	
	}

	public static void gameManager()
	{
		Scanner keyboard = new Scanner(System.in);
		int winner = (int) (Math.random() * 3 + 1);
	
		System.out.print("Please choose either 1, 2 or 3: ");
		int user = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("You chose door :" + user);
		
		int reveal = doorToReveal(winner, user);
		
		
		System.out.print("Door" + reveal + " is empty. Wanna switch your door? : ");
		
		String user_switch= keyboard.nextLine();
		
		if(user_switch.equals( "yes") || user_switch.equals("Yes"))
		{
			user_pick= doorToReveal(reveal, user_pick);
		}
		
		if(car==user_pick)
		{
			System.out.println("CONGRATULATIONS! YOU WIN!!");
		}
		else
		{
			System.out.println("You lose.");
		}
	
	}
	
	
	public static int doorToReveal(int x , int y)
	{
		int correctdoor = (int) (Math.random() *3 + 1);
		while(correctdoor == x || correctdoor == y )
		{
			correctdoor = (int)(Math.random() *3 + 1);
		}
		
		return correctdoor;
	
	
	}
	