package aima.core.environment.BlackAndWhitePuzzle;

import aima.core.agent.Action;
import aima.core.agent.impl.DynamicAction;

public class BlackAndWhitePuzzleBoard {

	public static Action RIGHT = new DynamicAction("RIGHT");
	
	public static Action LEFT = new DynamicAction("LEFT");

	public static Action JUMPR = new DynamicAction("JUMPR");

	public static Action JUMPL = new DynamicAction("JUMPL");

	public static Action DJUMPR = new DynamicAction("DJUMPR");
	
	public static Action DJUMPL = new DynamicAction("DJUMPL");

	private char[] state;

	//
	// PUBLIC METHODS
	//

	
	public BlackAndWhitePuzzleBoard() {
		state = new char[] {'B','B','B','G','W','W','W'};
	}
	
	public BlackAndWhitePuzzleBoard(char[] state) {
		this.state = new char[state.length];
		System.arraycopy(state, 0, this.state, 0, state.length);
	}

	public BlackAndWhitePuzzleBoard(BlackAndWhitePuzzleBoard copyBoard) {
		this(copyBoard.getState());
	}
	
	public char[] getState() {
		return state;
	}

	public void moveGapRight() {
		int gapPos = getGapPosition();
		if (gapPos != 6) {
			char valueOnRight = getValueAt(gapPos + 1);
			setValue(gapPos, valueOnRight);
			setValue(gapPos + 1, 'G');
		}
	}

	public void moveGapLeft() {
		int gapPos = getGapPosition();
		if (gapPos != 0) {
			char valueOnLeft = getValueAt(gapPos - 1);
			setValue(gapPos, valueOnLeft);
			setValue(gapPos - 1, 'G');
		}
	}
	
	public void jumpRight() {
		int gapPos = getGapPosition();
		if (gapPos < 5) {
			char valueOnJumpRight = getValueAt(gapPos + 2);
			setValue(gapPos, valueOnJumpRight);
			setValue(gapPos + 2, 'G');
		}
	}
	
	public void jumpLeft() {
		int gapPos = getGapPosition();
		if (gapPos > 1) {
			char valueOnJumpLeft = getValueAt(gapPos - 2);
			setValue(gapPos, valueOnJumpLeft);
			setValue(gapPos - 2, 'G');
		}
	}
	
	public void doubleJumpRight() {
		int gapPos = getGapPosition();
		if (gapPos < 4) {
			char valueOnDoubleJumpRight = getValueAt(gapPos + 3);
			setValue(gapPos, valueOnDoubleJumpRight);
			setValue(gapPos + 3, 'G');
		}
	}
	
	public void doubleJumpLeft() {
		int gapPos = getGapPosition();
		if (gapPos > 2) {
			char valueOnDoubleJumpLeft = getValueAt(gapPos - 3);
			setValue(gapPos, valueOnDoubleJumpLeft);
			setValue(gapPos - 3, 'G');
		}
	}
	
	
	
	private int getGapPosition() {
		return getPositionOf('G');
	}

	private int getPositionOf(char val) {
		int retVal = -1;
		for (int i = 0; i < 7; i++) {
			if (state[i] == val) {
				retVal = i;
			}
		}
		return retVal;
	}
	
	private char getValueAt(int pos) {
		return state[pos];
	}



	private void setValue(int pos, char val) {
		state[pos] = val;
	}

	public boolean canMoveGap(Action where) {
		boolean retVal = true;
		if (where.equals(RIGHT)) {
			int gapPos = getGapPosition();
			if (gapPos != 6) {
				return retVal;
			}
		} else if (where.equals(LEFT)) {
			int gapPos = getGapPosition();
			if (gapPos != 0) {
				return retVal;
			}
		} else if (where.equals(JUMPR)) {
			int gapPos = getGapPosition();
			if (gapPos < 5) {
				return retVal;
			}
		} else if (where.equals(JUMPL)) {
			int gapPos = getGapPosition();
			if (gapPos > 1) {
				return retVal;
			}
		} else if (where.equals(DJUMPR)) {
			int gapPos = getGapPosition();
			if (gapPos < 4) {
				return retVal;
			}
		} else if (where.equals(DJUMPL)) {
			int gapPos = getGapPosition();
			if (gapPos > 2) {
				return retVal;
			}
		}

		return false;
	}
	
// IMPORTATNTE CAMBIAR ESTO <<<<<<<<<<<<========================	

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}
		if ((o == null) || (this.getClass() != o.getClass())) {
			return false;
		}
		BlackAndWhitePuzzleBoard status = (BlackAndWhitePuzzleBoard) o;
		
//		No existe equals de status(es una array), comparamos los estados comparando posiciones
//		if(!status.getState().equals(this.getState()))
//			return false;
// 		SOMOS GILIPOLLAS PORQUE EN MANCAN ESTABA HECHO ASI...
		for(int i=0;i<7;i++){
			if(status.getState()[i]!=this.getState()[i]){
				return false;
			}
		}
		
		return true;
	}

	@Override
	public int hashCode() {
		int retVal = 0;
		for(int i = 0; i < 7; i++) {
			if (state[i] == 'B')
				retVal += 1*Math.pow(10, 7-i);
			else if (state[i] == 'W')
				retVal += 2*Math.pow(10, 7-i);
			else if (state[i] == 'G')
				retVal += 3*Math.pow(10, 7-i);
		}
		return retVal;
	}

	@Override
	public String toString() {
		String retVal = state[0] + " " + state[1] + " " + state[2] + " "
				+ state[3] + " " + state[4] + " " + state[5] + " " + " "
				+ state[6];
		return retVal;
	}

}
