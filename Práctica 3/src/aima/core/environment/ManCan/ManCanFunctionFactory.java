package aima.core.environment.ManCan;

import java.util.LinkedHashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.search.framework.ActionsFunction;
import aima.core.search.framework.ResultFunction;

/**
 * @author Ravi Mohan
 * @author Ciaran O'Reilly
 */
public class ManCanFunctionFactory {
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
			ManCanBoard board = (ManCanBoard) state;

			Set<Action> actions = new LinkedHashSet<Action>();

			if (board.beAbleToMove(ManCanBoard.ManCan)) {
				actions.add(ManCanBoard.ManCan);
			}
			if (board.beAbleToMove(ManCanBoard.Man2)) {
				actions.add(ManCanBoard.Man2);
			}
			if (board.beAbleToMove(ManCanBoard.Can2)) {
				actions.add(ManCanBoard.Can2);
			}
			if (board.beAbleToMove(ManCanBoard.Man)) {
				actions.add(ManCanBoard.Man);
			}
			if (board.beAbleToMove(ManCanBoard.Can)) {
				actions.add(ManCanBoard.Can);
			}
			return actions;
		}
	}

	private static class EPResultFunction implements ResultFunction {
		public Object result(Object s, Action a) {
			ManCanBoard board = (ManCanBoard) s;

			if (ManCanBoard.ManCan.equals(a)
					&& board.beAbleToMove(ManCanBoard.ManCan)) {
				ManCanBoard newBoard = new ManCanBoard(board);
				newBoard.moveManCan();
				return newBoard;
			} else if (ManCanBoard.Man2.equals(a)
					&& board.beAbleToMove(ManCanBoard.Man2)) {
				ManCanBoard newBoard = new ManCanBoard(board);
				newBoard.moveMan2();
				return newBoard;
			}
			else if (ManCanBoard.Can2.equals(a)
					&& board.beAbleToMove(ManCanBoard.Can2)) {
				ManCanBoard newBoard = new ManCanBoard(board);
				newBoard.moveCan2();
				return newBoard;
			}
			else if (ManCanBoard.Man.equals(a)
					&& board.beAbleToMove(ManCanBoard.Man)) {
				ManCanBoard newBoard = new ManCanBoard(board);
				newBoard.moveMan();
				return newBoard;
			}
			else if (ManCanBoard.Can.equals(a)
					&& board.beAbleToMove(ManCanBoard.Can)) {
				ManCanBoard newBoard = new ManCanBoard(board);
				newBoard.moveCan();
				return newBoard;
			}

			// The Action is not understood or is a NoOp
			// the result will be the current state.
			return s;
		}
	}
}