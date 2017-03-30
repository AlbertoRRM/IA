package aima.core.environment.ManCan;

import aima.core.search.framework.GoalTest;

/**
 * @author Ravi Mohan
 * 
 */
public class ManCanGoalTest implements GoalTest {
	ManCanBoard goal = new ManCanBoard(new int[] {0,0,1});

	public boolean isGoalState(Object state) {
		ManCanBoard board = (ManCanBoard) state;
		boolean ok =board.equals(goal);
		
		if( ok){
			System.out.println("");
		}
		return ok;
	}
}