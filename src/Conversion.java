import com.sun.istack.internal.FinalArrayList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;

import sun.font.CreatedFontTracker;

public class Conversion {
	public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
	}
	// read an FSM from a file.   open file, parse it and create the arguments for an fsm 
	// and call the FSM ctor. 
	public String fsmToRegex(IO.stream s) { 
		FSM fsm = new FSM(s );
		return fsm.fsmToRegex();
	}
public void createFSM() {

	}
	// implement the state elimination 

	
}
