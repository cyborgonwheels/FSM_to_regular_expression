p




				
ublic class FSM {
	public FSM(String fileName) {
		// read in the stream and create the users FSM

		ArrayList<FSMState> states = new ArrayList();  // all possible states of the fsm 
		ArrayList<Character> alphabet  = new ArrayList();
		ArrayList<TransRow> fromState  = new ArrayList(); // fromState[S.id] is list of transitions from S;
		

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                while (line.contains("q") {
                	states.n
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
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
	
		// Post condition: FSM has single initial state and a single final state
		// and is ready to run fsmToRegex();
		
		createnew(); // add dummy initial state and final
		      
	}
	
	public  String fsmToRegex() {
		// while not done {
		// pick a state s and removeState(s);
		FSMState s = new FSMState(7);
		removeState(s.id);
		// pick the single remainining edge and return edge.regexp
		return  new String("");
	}

	

		// Create initial and final states
		private  void createnew () {

		}
		// Copy the old fsm but create new initial and final states with empty transitions


		// remove states
		private  void removeState(int s) {
		}
}


// transitionTable[0][0] = ""ss);
		return fsm.fsmToRegex();
	}
public void createFSM() {

	}
	// implement the state elimination 

	
}
