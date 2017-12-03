# FSM_to_regular_expression

(State Elimination): Convert transitions to simple 
regular expressions. Add new start and final state 
with appropriate ε-transitions. Remove all other 
states, one state at a time reconstructing regular 
expression paths through the state being removed. 
For each pair of incoming and outgoing paths via thestate being removed (from x to y, labeled α and β, 
respectively), add a transition from x to y with the 
regular expression αγ*β (where γ is the regular 
expression on the self-loop on the state being 
removed, or ε). Union together the regular 
expressions for parallel transitions. When only the 
start and final state remain with one transition, that 
regular expression is the answer
