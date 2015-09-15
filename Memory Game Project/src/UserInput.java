import java.util.Scanner;
public class UserInput
	{
		static Scanner userInput=new Scanner(System.in);
			{
				AskForMove1();
				AskForMove2();
			}
			static String first;
			static String second;
			static int firstRow, firstCol, secondRow, secondCol; 
			static int success=0;
			public static void AskForMove1()
				{
					System.out.println("What Is Your Move?");
					Scanner input = new Scanner(System.in);
					first = input.nextLine();
					switch(first.substring(0,1))
					{
						case"a":
						case"A":
								{
									firstRow=0;
									break;
								}
						case"b":
						case"B":
								{
									firstRow=1;
									break;
								}		
						case"c":
						case"C":
								{
									firstRow=2;
									break;
								}
								
						case"d":
						case"D":
								{
									firstRow=3;
									break;
								}
					}
					firstCol= Integer.parseInt(first.substring(1))-1;
					Layout.layout[firstRow][firstCol]=Layout.hiddenLayout[firstRow][firstCol];
					Layout.layout();
					
				}
			public static void AskForMove2()
				{
					System.out.println("What Is Your Move?");
					Scanner input2 = new Scanner(System.in);
					second = input2.nextLine();
					switch(second.substring(0,1))
					{
						case"a":
						case"A":
								{
									secondRow=0;
									break;
								}
						case"b":
						case"B":
								{
									secondRow=1;
									break;
								}		
						case"c":
						case"C":
								{
									secondRow=2;
									break;
								}
								
						case"d":
						case"D":
								{
									secondRow=3;
									break;
								}
					}
					secondCol= Integer.parseInt(second.substring(1))-1;
					Layout.layout[secondRow][secondCol]=Layout.hiddenLayout[secondRow][secondCol];
					Layout.layout();
					
				}
			public static void CheckMove() throws InterruptedException
				{
					
					if (! Layout.layout[firstRow][firstCol].equals(Layout.layout[secondRow][secondCol]))
						{
							Thread.sleep(2000);
							Layout.layout[firstRow][firstCol]="   ";
							Layout.layout[secondRow][secondCol]="   ";
							Layout.layout();
						}
					else
						{
							success++;
						}
				}
			
			
	}










