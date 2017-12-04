

/**
 * @author Teresa
 *
 */

/*
 * The program runs by taking the first argument passed to main and treating it as the input filename.
 * For testing purposes, in eclipse, we create configurations we can use for test and debug.
 * Configuration Test1 passes the file 1.txt as our fsm argument. 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FSM test = new FSM(args[0]);
	}

}
