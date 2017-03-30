package aima.core.environment.BlackAndWhitePuzzle;

import aima.core.search.framework.HeuristicFunction;

/**
 * @author Ravi Mohan
 * 
 */

/*
Las blancas, para que estén bien, solo pueden ir de la posicion 0 a la 3 y 
las negras solo pueden ir de la 3 a la 6.
Suma de las piezas blancas o negras que estén fuera de ese rango
*/

public class BadPositionedHeuristicFunction implements HeuristicFunction {

	public double h(Object state) {
		BlackAndWhitePuzzleBoard board = (BlackAndWhitePuzzleBoard ) state;
		return getNumberOfWellPositionedTiles(board);
	}

	private int getNumberOfWellPositionedTiles(BlackAndWhitePuzzleBoard  board) {
		int numberOfWellPositionedTiles = 0;
		for(int i=0;i<4;i++){
			if(board.getState()[i]=='W'){
				numberOfWellPositionedTiles++;
			}
		}
		for(int i=3;i<7;i++){
			if(board.getState()[i]=='B'){
				numberOfWellPositionedTiles++;
			}
		}

		return 6-numberOfWellPositionedTiles++;
	}
}