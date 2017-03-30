package aima.core.environment.ManCan;

import aima.core.search.framework.HeuristicFunction;

/**
 * @author Ravi Mohan
 * 
 */

/*Asumimos que los canibales nunca comen a los hombres.
En cada viaje transportamos a una persona (la otra vuelve con la barca a coger al resto)
La funcion nos queda del tipo 2(nºhombres+nºcanibales)-orilla (si la barca está en la orrilla izq, orilla=1.Si no orilla =0.)
Ejemplo.Quedan 5 en la orilla izquierda y la barca en la izq .Numero de trayectos seria 9 = (2*5)-1
*/

public class NonAttackHeuristicFunction implements HeuristicFunction {

	public double h(Object state) {
		ManCanBoard board = (ManCanBoard) state;
		int [] newstate = board.getState();
		if(newstate[2]==-1)//Orilla izquierda,un trayecto -
			return ( 2*(newstate[0]+newstate[1]) - 1);
		else
			return ( 2*(newstate[0]+newstate[1]));
	}
}