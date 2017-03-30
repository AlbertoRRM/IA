package aima.core.environment.MANCAN;

import aima.core.search.framework.GoalTest;

/**
 * @author Ravi Mohan
 * 
 */
public class MANCANGoalTest implements GoalTest {
	MANCANBoard goal = new MANCANBoard(new int[] {0,0,1});

	public boolean isGoalState(Object state) {
		MANCANBoard board = (MANCANBoard) state;
		boolean ok =board.equals(goal);
		
		if( ok){
			System.out.println("");
		}
		return ok;
	}
}