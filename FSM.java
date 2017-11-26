


Public Class FSM ()

      ArrayList fsm ≠
      newnew ArrayList();
      System.out.println("Initial size of al: " + al.size());
//Convert transitions to simple 
//regular expressions. 

 // Add new and final state 
// with appropriate ε-transitions.

// Remove all other 
// states, one state at a time reconstructing regular 
//expression paths through the state being removed. 
For each pair of incoming and outgoing paths via thestate being removed (from x to y, labeled α and β, 
respectively), add a transition from x to y with the 
regular expression αγ*β (where γ is the regular 
expression on the self-loop on the state being 
removed, or ε). Union together the regular 
expressions for parallel transitions. When only the 
start and final state remain with one transition, that 
regular expression is the answer

      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);

      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
   }
}
