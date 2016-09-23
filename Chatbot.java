import java.util.Scanner; //gotta do this for use input

/**
*This class represents a basic AI that will chat with a human user. 
*Isn't very human-like yet
* @author Miro Bergam
* @version 0.1
*/

public class Chatbot
{
	public static void main(String[] args)
	{
		Scanner keys = new Scanner(System.in); //New scanner
		//system.in is keyboard/input
		//system.out is monitor / 0utput
		
		System.out.println("Hi I'm chatbot. What's your name?");
		String userName = keys.nextLine();
		
		System.out.println("Nice to meet you, " + userName +" how old are you?");
		int age = keys.nextInt(); //Leaves the pointer before new line character, soooo
		keys.nextLine();
		
		if (age > 40)
		{
			System.out.println("Wow, thats OLD");
			System.out.println("Only " + (100-age) + " years until you're 100!");
		}
		else
		{
			System.out.println("How long until you turn " + (++age) + "?"); //++ adds one
			keys.nextLine(); //Let's the user answer byt doesn't store the answer
		}
		String answer = "anything other than bye";  //just to get into the loop, can be anything
		while (! answer.equals("bye") & ! answer.equals("Bye")) //!= compares reference, cant be used
		{
			System.out.println("Tell me one of your hobbies (or say \"bye\" to exit)"); // back slash makes sure the quotes dont end the string
			answer = keys.nextLine();
		}
			
	}
}
//|| means or
// && means and