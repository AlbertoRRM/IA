package aima.core.environment.BlackAndWhitePuzzle;

import java.util.LinkedHashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.search.framework.ActionsFunction;
import aima.core.search.framework.ResultFunction;

public class BlackAndWhiteFunctionFactory {
	private static ActionsFunction _actionsFunction = null;
	private static ResultFunction _resultFunction = null;

	public static ActionsFunction getActionsFunction() {
		if (null == _actionsFunction) {
			_actionsFunction = new EPActionsFunction();
		}
		return _actionsFunction;
	}

	public static ResultFunction getResultFunction() {
		if (null == _resultFunction) {
			_resultFunction = new EPResultFunction();
		}
		return _resultFunction;
	}

	private static class EPActionsFunction implements ActionsFunction {
		public Set<Action> actions(Object state) {
			BlackAndWhitePuzzleBoard board = (BlackAndWhitePuzzleBoard) state;

			Set<Action> actions = new LinkedHashSet<Action>();

			if (board.canMoveGap(BlackAndWhitePuzzleBoard.RIGHT)) {
				actions.add(BlackAndWhitePuzzleBoard.RIGHT);
			}
			if (board.canMoveGap(BlackAndWhitePuzzleBoard.LEFT)) {
				actions.add(BlackAndWhitePuzzleBoard.LEFT);
			}
			if (board.canMoveGap(BlackAndWhitePuzzleBoard.JUMPR)) {
				actions.add(BlackAndWhitePuzzleBoard.JUMPR);
			}
			if (board.canMoveGap(BlackAndWhitePuzzleBoard.JUMPL)) {
				actions.add(BlackAndWhitePuzzleBoard.JUMPL);
			}
			if (board.canMoveGap(BlackAndWhitePuzzleBoard.DJUMPR)) {
				actions.add(BlackAndWhitePuzzleBoard.DJUMPR);
			}
			if (board.canMoveGap(BlackAndWhitePuzzleBoard.DJUMPL)) {
				actions.add(BlackAndWhitePuzzleBoard.DJUMPL);
			}
			return actions;
		}
	}

	private static class EPResultFunction implements ResultFunction {
		public Object result(Object state, Action a) {
			BlackAndWhitePuzzleBoard board = (BlackAndWhitePuzzleBoard) state;

			if (BlackAndWhitePuzzleBoard.RIGHT.equals(a)
					&& board.canMoveGap(BlackAndWhitePuzzleBoard.RIGHT)) {
				BlackAndWhitePuzzleBoard newBoard = new BlackAndWhitePuzzleBoard(board);
				newBoard.moveGapRight();
				return newBoard;
			} else if (BlackAndWhitePuzzleBoard.LEFT.equals(a)
					&& board.canMoveGap(BlackAndWhitePuzzleBoard.LEFT)) {
				BlackAndWhitePuzzleBoard newBoard = new BlackAndWhitePuzzleBoard(board);
				newBoard.moveGapLeft();
				return newBoard;
			} else if (BlackAndWhitePuzzleBoard.JUMPR.equals(a)
					&& board.canMoveGap(BlackAndWhitePuzzleBoard.JUMPR)) {
				BlackAndWhitePuzzleBoard newBoard = new BlackAndWhitePuzzleBoard(board);
				newBoard.jumpRight();
				return newBoard;
			} else if (BlackAndWhitePuzzleBoard.JUMPL.equals(a)
					&& board.canMoveGap(BlackAndWhitePuzzleBoard.JUMPL)) {
				BlackAndWhitePuzzleBoard newBoard = new BlackAndWhitePuzzleBoard(board);
				newBoard.jumpLeft();
				return newBoard;
			}  else if (BlackAndWhitePuzzleBoard.DJUMPR.equals(a)
					&& board.canMoveGap(BlackAndWhitePuzzleBoard.DJUMPR)) {
				BlackAndWhitePuzzleBoard newBoard = new BlackAndWhitePuzzleBoard(board);
				newBoard.doubleJumpRight();
				return newBoard;
			} else if (BlackAndWhitePuzzleBoard.DJUMPL.equals(a)
					&& board.canMoveGap(BlackAndWhitePuzzleBoard.DJUMPL)) {
				BlackAndWhitePuzzleBoard newBoard = new BlackAndWhitePuzzleBoard(board);
				newBoard.doubleJumpLeft();
				return newBoard;
			}

			// The Action is not understood or is a NoOp
			// the result will be the current state.
			return state;
		}
	}
}
