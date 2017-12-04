
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.attribute.standard.PrinterLocation;

import com.sun.corba.se.spi.orbutil.fsm.State;
import com.sun.istack.internal.FinalArrayList;

import java.util.*;  
import java.util.*;  

public class FSM {
	//Our tranitions match this pattern 		s0:a>s2
		static final Pattern PATTERN = Pattern.compile("s(\\d+):([a-z])>s(\\d+)");


	public FSM(String fileName) {
		// read in the stream and create the users FSM

		//ArrayList<FSMState> states = new ArrayList<FSMState>();  // all possible states of the fsm 
		// Chose to use hash table instead since they allow for easier lookup of state from integer.
	 	Hashtable<Integer,FSMState> states = new Hashtable<Integer,FSMState>();  
		ArrayList<Character> alphabet  = new ArrayList<Character>();
		ArrayList<TransRow> fromState  = new ArrayList<TransRow>(); // fromState[S.id] is list of transitions from S;


		// This will reference one line at a time
		String line = null;


		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = 
					new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = 
					new BufferedReader(fileReader);

			// Assuming no blank lines
			
			
			while((line = bufferedReader.readLine()) != null) {
				if (line.equalsIgnoreCase("#states")) {
					line = bufferedReader.readLine();
					while (!line.startsWith("#")) {
						Scanner in = new Scanner(line).useDelimiter("[^0-9]+");
						int id = in.nextInt();
						states.put(id,new FSMState(id));
						line = bufferedReader.readLine();
					}
				}
				if (line.equalsIgnoreCase("#initial")) {
					line = bufferedReader.readLine();  // we only expect 1 initial
					Scanner in = new Scanner(line).useDelimiter("[^0-9]+");
					int initState = in.nextInt();
					states.get(initState).initialState=true;
				
				}
				
				if (line.equalsIgnoreCase("#accepting")) {
					line = bufferedReader.readLine();  // we only expect 1 initial
					while (!line.startsWith("#")) {
						Scanner in = new Scanner(line).useDelimiter("[^0-9]+");
						int acceptingState = in.nextInt();
						states.get(acceptingState).acceptingState=true;
						line = bufferedReader.readLine();
					}
				}
				if (line.equalsIgnoreCase("#alphabet")) {
					line = bufferedReader.readLine();  // we only expect 1 initial
					while (!line.startsWith("#")) {
						Character c = line.charAt(0);
						alphabet.add(c);
						line = bufferedReader.readLine();
					}
				}
		
				if (line.equalsIgnoreCase("#transitions")) {
					line = bufferedReader.readLine();  // we only expect 1 initial
					while (line != null && ! (line.startsWith("#"))) {
						Matcher matcher = PATTERN.matcher(line);
						if (matcher.find()) {
							System.out.println(matcher.group(1).trim()); // from
							System.out.println(matcher.group(2)); // on
							System.out.println(matcher.group(3)); // to
						}

						line = bufferedReader.readLine();
					}
				}

			}

			// Always close files.
			bufferedReader.close();         
		}
		catch(FileNotFoundException ex) {
			System.out.println(
					"Unable to open file '" + 
							fileName + "'");                
		}
		catch(IOException ex) {
			System.out.println(                "Error reading file '" 	+ fileName + "'");
		}


	}  // end of CTOR
	
	


	
	// Copy the old fsm but create new initial and final states with empty transitions

	
	public  String fsmToRegex() {
		// while not done {
		// pick a state s and removeState(s);
		FSMState s = new FSMState(7);
		removeState(s.id);
		// pick the single remainining edge and return edge.regexp
		return  new String("");
	}



	//Create initial and final states
	private  void createnew () {
		//FSMState start = new FSMState();
		//states
	}
	//Copy the old fsm but create new initial and final states with empty transitions


	//remove states
	private  void removeState(int s) {
	}
}

