
public class Runner
	{
		static int counter1=0;
		public static boolean gameContinues=true;
		public static void main(String[] args) throws InterruptedException
			{
				Layout.setup();
				Layout.layout();
				BoardLoad.loader();
				while(gameContinues)
					{
							UserInput.AskForMove1();
							UserInput.AskForMove2();
							UserInput.CheckMove();
							if(UserInput.success==8)
								{
									gameContinues=false;
								}
							counter1++;	
					}
				System.out.println("You won in: "+counter1);

			}

	}
