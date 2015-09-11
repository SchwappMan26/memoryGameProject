import java.util.Scanner;
public class userInput
	{
		static Scanner userInput=new Scanner(System.in);
			{
				askForMove();
			}
			public static void askForMove();
				{
					System.out.println("What Is Your Move?");
					String move = userInput.nextLine();
					if (move.equals("A1")||move.equals("a1"))
						{
							layout.board[0][0]=boardLoad.loader();
						}
				}
	}
