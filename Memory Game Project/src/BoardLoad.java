import java.util.ArrayList;
import java.util.Collections;

public class BoardLoad
	{
			
				//loader();
			
			static ArrayList <String>objects = new ArrayList<String>();
			public static void loader()
				{
					
					objects.add("dog");
					objects.add("dog");	
					objects.add("cat");
					objects.add("cat");
					objects.add("pig");
					objects.add("pig");
					objects.add("cow");
					objects.add("cow");
					objects.add("rat");
					objects.add("rat");
					objects.add("bat");
					objects.add("bat");
					objects.add("ant");
					objects.add("ant");
					objects.add("bee");
					objects.add("bee");
					
					Collections.shuffle(objects);
					int counter=0;
					for(int row=0;row<16;row++)
						{
							for(int col=0;col<16;col++)
								{
									Layout.layout[row][col]=objects.get(counter);
									counter++;	
								}
						}
					
					
					
					
				}
	}
