
public class Transition {
	FSMState nextState;
	Character event;
	String    regexp;
	
	public Transition(FSMState s, Character e) {
		regexp = "";
		nextState = s;
		event = e;
	}
	

}
