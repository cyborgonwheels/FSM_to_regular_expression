import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.io;

import com.sun.corba.se.spi.orbutil.fsm.State;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

public class FSM {
	public FSM(ArrayList<String> a_states, String a_initial, ArrayList<String> a_acceptingStates,
			ArrayList<String> a_alphabet, String[][] a_transitionTable) {
		states = a_states;   // states is a ref to a_states (so no O(n) copy of the members
		initialState = a_initial;
		acceptingStates = a_acceptingStates;
		alphabet = a_alphabet;
		transitionTable = a_transitionTable;
	}
	public FSM(IO.stream) {
		// read in the stream and create the users FSM
		
		// Post condition: FSM has single initial state and a single final state
		// and is ready to run fsmToRegex();
		
		createnew(); // add dummy initial state and final
		      
	}
	

	ArrayList<State> states;  // all possible states of the fsm 
	ArrayList<Character> alphabet;
	ArrayList<TransRow> fromState; // fromState[S.id] is list of transitions from S;
	
	public  String fsmToRegex() {
		// while not done {
		// pick a state s and removeState(s);
		
		// pick the single remainining edge and return edge.regexp
	}

	
	// Convert transitions to simple regular expressions.
		private  void simpleregex() {
			// TODO Auto-generated method stub

		}     

		// Create initial and final states
		private  void createnew () {

		}
		// Copy the old fsm but create new initial and final states with empty transitions


		// remove states
		private  void removeState(int s) {
		}
}


// transitionTable[0][0] = ""