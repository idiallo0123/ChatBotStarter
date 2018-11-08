import java.util.Scanner;

/**
 * A simple class to run our chatbot teams.
 * @author Brooklyn Tech CS Department
 * @version September 2018
 */
public class SesameStreetRunner
{

	/**
	 * Create instances of each chatbot, give it user input, and print its replies. Switch chatbot responses based on which chatbot the user is speaking too.
	 */
	public static void main(String[] args)
	{
		Elmo chatbot1 = new Elmo();
		CookieMonster chatbot2 = new CookieMonster();
		Oscar chatbot3 = new Oscar();
		

		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to the Sesame Street, nice to meet you.");
		String statement = in.nextLine();


		while (!statement.equalsIgnoreCase("Bye"))
		{
			//Use Logic to control which chatbot is handling the conversation\
			//This example has only chatbot1
			System.out.println("Would you like to Elmo, Cookie Monster, or Oscar");
			Scanner input = new Scanner(System.in);
			String choice = input.nextLine();

			if (choice.equalsIgnoreCase("Elmo"))
			{
				chatbot1.chatLoop(choice);
			}
			if (choice.equalsIgnoreCase("Cookie Monster"))
			{
				chatbot2.chatLoop(choice);
			}
			if (choice.equalsIgnoreCase("Oscar"))
			{
				chatbot3.chatLoop(choice);
			}

			statement = in.nextLine();


		}
	}

}
