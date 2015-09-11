import java.util.Scanner;
public class layout
	{
		static String layout[][]=new String[4][4];
			{
				board();
			}
			public static void setup()
				{
					for(int row=0;row<layout.length;row++)
						{
							for(int col=0; col<layout[0].length;col++)
								{
									layout[row][col]="   ";
								}
						}
				}
			public static void board()
				{
					System.out.println("     1      2      3      4");
					System.out.println("   ----------------------------");
					System.out.println("A: |"+ layout[0][0]+" | "+layout[0][1]+" | "+layout[0][2]+" | "+layout[0][3]+" |");
					System.out.println("   ----------------------------");
					System.out.println("B: |"+ layout[1][0]+" | "+layout[1][1]+" | "+layout[1][2]+" | "+layout[1][3]+" |");
					System.out.println("   ----------------------------");
					System.out.println("C: |"+ layout[2][0]+" | "+layout[2][1]+" | "+layout[2][2]+" | "+layout[2][3]+" |");
					System.out.println("   ----------------------------");
					System.out.println("D: |"+ layout[3][0]+" | "+layout[3][1]+" | "+layout[3][2]+" | "+layout[3][3]+" |");	
					System.out.println("   ----------------------------");
				}
			public static void gameWon()
				{
					
				}
	}
