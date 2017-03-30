package aima.core.environment.BlackAndWhitePuzzle;

import aima.core.search.framework.HeuristicFunction;

/**
 * @author Ravi Mohan
 * 
 */
public class BWMisplacedTilleHeuristicFunction implements HeuristicFunction {

	public double h(Object state) {
		BlackAndWhitePuzzleBoard board = (BlackAndWhitePuzzleBoard) state;
		return getNumberOfMisplacedTiles(board);
	}

	private int getNumberOfMisplacedTiles(BlackAndWhitePuzzleBoard  board) {
		int numberOfMisplacedTiles = 6;
		for(int i = 0; i < 4; i++){
			if(board.getState()[i]=='W')
				numberOfMisplacedTiles--;
			else if (board.getState()[i] == 'B') // Si encuentra una negra, salimos del bucle
				i = 4;
		}
		for(int i = 6; i > 2; i--) {
			if(board.getState()[i]=='B')
				numberOfMisplacedTiles--;
			else if (board.getState()[i] == 'W') // Si encuentra una negra, salimos del bucle
				i = 3;
		}
		return numberOfMisplacedTiles;
		}
	}	
