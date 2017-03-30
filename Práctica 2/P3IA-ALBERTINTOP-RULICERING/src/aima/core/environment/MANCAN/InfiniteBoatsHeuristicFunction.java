package aima.core.environment.MANCAN;

import aima.core.environment.eightpuzzle.EightPuzzleBoard;
import aima.core.search.framework.HeuristicFunction;
import aima.core.util.datastructure.XYLocation;

/**
 * @author Ravi Mohan
 * 
 */
public class InfiniteBoatsHeuristicFunction implements HeuristicFunction {

	public double h(Object state) {
		MANCANBoard board = (MANCANBoard) state;
		int [] newstate = board.getState();
		return (newstate[0]+newstate[1])/2;
		
		//Asumimos que lo que nos queda de recorrido es los pasos que tardariamos en llevarlos a todos.
		//La barca puede volver sola <<=== KEY
	}
}