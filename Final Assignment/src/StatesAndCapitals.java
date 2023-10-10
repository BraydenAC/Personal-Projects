import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Computer Science 201 Final Assignment
//To show proficient knowledge in the course content
//Brayden Cloutier
//Begun 2/8/2023, finished 2/14/2023wes

public class StatesAndCapitals {
	
	public static void main(String[] args) {
		//Initializing Scanner
		Scanner input = new Scanner(System.in);
		
		//Initializing maps
		Map<String, String> scMap = new HashMap<String, String>();
		TreeMap<String, String> sortedMap = new TreeMap<String, String>();
		
		//Initializing Binary Search Tree
		NodeOuter storageBTree = new NodeOuter();
		
		//Initializing array with states and capitals
		String[][] names = 	    {{"alabama", "montgomery"},
								 {"alaska",  "juneau"},
								 {"arizona", "phoenix"},
								 {"arkansas", "little rock"},
								 {"california", "sacramento"},
								 {"colorado", "denver"},
								 {"connecticut", "hartford"},
								 {"delaware", "dover"},
								 {"florida", "tallahassee"},
								 {"georgia", "atlanta"},
								 {"hawaii", "honolulu"},
								 {"idaho", "boise"},
								 {"illinois", "springfield"},
								 {"indiana", "indianapolis"},
								 {"iowa", "des moines"},
								 {"kansas", "topeka"},
								 {"kentucky", "frankfort"},
								 {"louisiana", "baton rouge"},
								 {"maine", "augusta"},
								 {"maryland", "annapolis"},
								 {"massachusetts", "boston"},
								 {"michigan", "lansing"},
								 {"minnesota", "saint paul"},
								 {"mississippi", "jackson"},
								 {"missouri", "jefferson city"},
								 {"montana", "helena"},
								 {"nebraska", "lincoln"},
								 {"nevada", "carson city"},
								 {"new hampshire", "concord"},
								 {"new jersey", "trenton"},
								 {"new mexico", "santa fe"},
								 {"new york", "albany"},
								 {"north carolina", "raleigh"},
								 {"north dakota", "bismarck"},
								 {"ohio", "columbus"},
								 {"oklahoma", "oklahoma city"},
								 {"oregon", "salem"},
								 {"pennsylvania", "harrisburg"},
								 {"rhode island", "providence"},
								 {"south carolina", "columbia"},
								 {"south dakota", "pierre"},
								 {"tennessee", "nashville"},
								 {"texas", "austin"},
								 {"utah", "salt lake city"},
								 {"vermont", "montpelier"},
								 {"virginia", "richmond"},
								 {"washington", "olympia"},
								 {"west virginia", "charleston"},
								 {"wisconsin", "madison"},
								 {"wyoming", "cheyenne"} };
		
		//PART 2 ASSIGNMENT REVISION
		//Places array members into a hashmap and displays the hashmap
		System.out.printf("%-17s %-17s%n", "Key", "Value");
		for(int x = 0; x < names.length; x++)
		{
			scMap.put(names[x][0], names[x][1]);
			
			
			System.out.printf("%-17s %-17s%n", names[x][0], scMap.get(names[x][0]));
		}
		
		//Sorts by entering the hashmap entries into a treemap
		for(Map.Entry<String, String> m : scMap.entrySet())
		{
			sortedMap.put(m.getKey(), m.getValue());
		}
		
		//Places the sorted entries of the Treemap into a binary search tree for storage
		for(Map.Entry<String, String> m : sortedMap.entrySet()) 
		{
			storageBTree.insert(m.getKey(), m.getValue());
		}
		
		//Prompts the user to enter a state, then returns the associated value
		String stateInput = "fillerString";
		while(stateInput.equals("stop") == false)
		{
			System.out.print("Please input a state name or 'stop' to quit: ");
			stateInput = input.nextLine().toLowerCase();
			if(stateInput.equalsIgnoreCase("stop") == false)
			{
				try {
					System.out.printf("The capital for %s is %s.%n", stateInput, storageBTree.find(stateInput));
				}
				catch(NullPointerException e)
				{
					System.out.println("State/Capital pair not found.");
				}
			}
			else {
				System.out.println("Application Complete");
			}
		}
		
		
		
		
		
		/*WAS A PART OF PART 1, COMMENTED OUT DUE TO PART 2 REVISION
		 * 
		//Displaying current contents of array
		System.out.printf("%-17s %-17s%n", "STATES", "CAPITALS");
		for(int x = 0; x < names.length; x++)
		{
			System.out.printf("%-17s %-17s%n", names[x][0], names[x][1]);
		}
		
		//Sorting array using bubble sort
		sortByCapital(names);
		
		//Outputting states for user to guess and input the capitals of
		int correctAnswerCount = 0;
		for(int x = 0; x < names.length; x++)
		{
			System.out.printf("%nWhat is the capital for the state of %s:  ", names[x][0]);
			String capAnswer = input.next();
			
			if(capAnswer.equalsIgnoreCase(names[x][1]))
			{
				correctAnswerCount++;
			}
		}
		
		//Outputting correct answer count
		System.out.printf("%nYou got %d answers correct!", correctAnswerCount);
		
	}
	
	public static String[][] sortByCapital(String[][] sortable)
	{
		//Gains the length of the array for the loops
		int arrayLength = sortable.length;
		
		
		//Loops through entire array
		for(int x = 0; x < arrayLength - 1; x++)
		{
			//Loops through the entire array in decreasing increments, going smaller as the array members fall into place
			for(int y = 0; y < arrayLength - x - 1; y++)
			{
				//Checks if first string is before the second string alphabetically
				if(sortable[y][1].compareTo(sortable[y + 1][1]) > 0) 
				{
					//Flips the first and second capitol
					String temp = sortable[y][1];
					sortable[y][1] = sortable[y + 1][1];
					sortable[y + 1][1] = temp;
					
					//Flips the corresponding states as well
					String temp2 = sortable[y][0];
					sortable[y][0] = sortable[y + 1][0];
					sortable[y + 1][0] = temp2;
				}
			}
		}
		
		//returns sorted array
		return sortable;
		*/
	}
	
}
