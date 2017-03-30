package aima.core.environment.MANCAN;

import java.util.LinkedHashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.search.framework.ActionsFunction;
import aima.core.search.framework.ResultFunction;

/**
 * @author Ravi Mohan
 * @author Ciaran O'Reilly
 */
public class MANCANFunctionFactory {
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
			MANCANBoard board = (MANCANBoard) state;

			Set<Action> actions = new LinkedHashSet<Action>();

			if (board.beAbleToMove(MANCANBoard.MANCAN)) {
				actions.add(MANCANBoard.MANCAN);
			}
			if (board.beAbleToMove(MANCANBoard.MAN2)) {
				actions.add(MANCANBoard.MAN2);
			}
			if (board.beAbleToMove(MANCANBoard.CAN2)) {
				actions.add(MANCANBoard.CAN2);
			}
			if (board.beAbleToMove(MANCANBoard.MAN)) {
				actions.add(MANCANBoard.MAN);
			}
			if (board.beAbleToMove(MANCANBoard.CAN)) {
				actions.add(MANCANBoard.CAN);
			}
			return actions;
		}
	}

	private static class EPResultFunction implements ResultFunction {
		public Object result(Object s, Action a) {
			MANCANBoard board = (MANCANBoard) s;

			if (MANCANBoard.MANCAN.equals(a)
					&& board.beAbleToMove(MANCANBoard.MANCAN)) {
				MANCANBoard newBoard = new MANCANBoard(board);
				newBoard.moveMANCAN();
				return newBoard;
			} else if (MANCANBoard.MAN2.equals(a)
					&& board.beAbleToMove(MANCANBoard.MAN2)) {
				MANCANBoard newBoard = new MANCANBoard(board);
				newBoard.moveMAN2();
				return newBoard;
			}
			else if (MANCANBoard.CAN2.equals(a)
					&& board.beAbleToMove(MANCANBoard.CAN2)) {
				MANCANBoard newBoard = new MANCANBoard(board);
				newBoard.moveCAN2();
				return newBoard;
			}
			else if (MANCANBoard.MAN.equals(a)
					&& board.beAbleToMove(MANCANBoard.MAN)) {
				MANCANBoard newBoard = new MANCANBoard(board);
				newBoard.moveMAN();
				return newBoard;
			}
			else if (MANCANBoard.CAN.equals(a)
					&& board.beAbleToMove(MANCANBoard.CAN)) {
				MANCANBoard newBoard = new MANCANBoard(board);
				newBoard.moveCAN();
				return newBoard;
			}

			// The Action is not understood or is a NoOp
			// the result will be the current state.
			return s;
		}
	}
}