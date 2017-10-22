
public class FSMState {
	// Represents a State in an FSM
	public FSMState (int r) {
		id = r;
		initialState = false;
		acceptingState = false;
		
	}
    int id;   // A unique integer 
    boolean initialState;  // true if we are one of the initial states
    boolean acceptingState; // true if we are an accepting state.
}
