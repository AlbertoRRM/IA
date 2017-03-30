package aima.core.environment.ManCan;

import aima.core.search.framework.HeuristicFunction;

/**
 * @author Ravi Mohan
 * 
 */
public class InfiniteBoatsHeuristicFunction implements HeuristicFunction {

	public double h(Object state) {
		ManCanBoard board = (ManCanBoard) state;
		int [] newstate = board.getState();
		return (newstate[0]+newstate[1])/2;
		
		//Asumimos que lo que nos queda de recorrido es los pasos que tardariamos en llevarlos a todos.
	}
}