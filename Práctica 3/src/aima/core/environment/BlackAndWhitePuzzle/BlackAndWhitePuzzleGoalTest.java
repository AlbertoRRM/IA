package aima.core.environment.BlackAndWhitePuzzle;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.framework.GoalTest;

public class BlackAndWhitePuzzleGoalTest implements GoalTest{
	

	public boolean isGoalState(Object state) {
		List <BlackAndWhitePuzzleBoard> goal = new ArrayList<BlackAndWhitePuzzleBoard>();
		
		goal.add(new BlackAndWhitePuzzleBoard(new char[] {'W', 'W', 'W', 'G', 'B', 'B', 'B'}));
		goal.add(new BlackAndWhitePuzzleBoard(new char[] {'W', 'W', 'W', 'B', 'G', 'B', 'B'}));
		goal.add(new BlackAndWhitePuzzleBoard(new char[] {'W', 'W', 'W', 'B', 'B', 'G', 'B'}));
		goal.add(new BlackAndWhitePuzzleBoard(new char[] {'W', 'W', 'W', 'B', 'B', 'B', 'G'}));
		goal.add(new BlackAndWhitePuzzleBoard(new char[] {'G', 'W', 'W', 'W', 'B', 'B', 'B'}));
		goal.add(new BlackAndWhitePuzzleBoard(new char[] {'W', 'G', 'W', 'W', 'B', 'B', 'B'}));
		goal.add(new BlackAndWhitePuzzleBoard(new char[] {'W', 'W', 'G', 'W', 'B', 'B', 'B'}));
		BlackAndWhitePuzzleBoard board = (BlackAndWhitePuzzleBoard) state;
		return (board.equals(goal.get(0)) || board.equals(goal.get(1)) || 
				board.equals(goal.get(2)) || board.equals(goal.get(3)) || 
				board.equals(goal.get(4)) || board.equals(goal.get(5)) || 
				board.equals(goal.get(6)));
	}
}
