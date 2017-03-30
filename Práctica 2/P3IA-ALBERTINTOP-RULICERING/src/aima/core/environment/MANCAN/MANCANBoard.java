package aima.core.environment.MANCAN;

import java.util.ArrayList;
import java.util.List;

import aima.core.agent.Action;
import aima.core.agent.impl.DynamicAction;
import aima.core.util.datastructure.XYLocation;

/**
 * @author Ravi Mohan
 * @author R. Lunde
 */
public class MANCANBoard {

	public static Action MANCAN = new DynamicAction("MANCAN");

	public static Action MAN2 = new DynamicAction("MAN2");

	public static Action CAN2 = new DynamicAction("CAN2");

	public static Action MAN = new DynamicAction("MAN");
	
	public static Action CAN = new DynamicAction("CAN");

	private int[] state;

	//
	// PUBLIC METHODS
	//

	
	// Orilla izquierda -1 , los dos primeros numeros (MAN,CAN) en ORILLA IZQUIERDA.
	public MANCANBoard() {
		state = new int[] { 3,3,-1};
	}

	public MANCANBoard(int[] state) {
		this.state = new int[state.length];
		System.arraycopy(state, 0, this.state, 0, state.length);
	}

	public MANCANBoard(MANCANBoard copyBoard) {
		this(copyBoard.getState());
	}


	public int[] getState() {
		return state;
	}

	
	
	public void moveMANCAN(){
		if(state[2]==-1){//IZQ-->DER .SE RESTAN LOS QUE SE MUEVEN.
			state[0]=state[0] - 1;
			state[1]=state[1] - 1 ;
		}
		else{ // DER---->IZQ .SE SUMAN LOS QUE SE MUEVEN.
			state[0]=state[0] + 1;
			state[1]=state[1] + 1 ;
			
		}			
		state[2]=state[2]*(-1);		
	}
	
	public void moveMAN2(){
		if(state[2]==-1){//IZQ-->DER .SE RESTAN LOS QUE SE MUEVEN.
			state[0]=state[0] - 2;
		}
		else{ // DER---->IZQ .SE SUMAN LOS QUE SE MUEVEN.
			state[0]=state[0] + 2;	
		}			
		state[2]=state[2]*(-1);		
	}
	
	public void moveCAN2(){
		if(state[2]==-1){//IZQ-->DER .SE RESTAN LOS QUE SE MUEVEN.
			state[1]=state[1] - 2 ;
		}
		else{ // DER---->IZQ .SE SUMAN LOS QUE SE MUEVEN.
			state[1]=state[1] + 2 ;			
		}			
		state[2]=state[2]*(-1);		
	}
	
	public void moveMAN(){
		if(state[2]==-1){//IZQ-->DER .SE RESTAN LOS QUE SE MUEVEN.
			state[0]=state[0] - 1;
		}
		else{ // DER---->IZQ .SE SUMAN LOS QUE SE MUEVEN.
			state[0]=state[0] + 1;
			
		}			
		state[2]=state[2]*(-1);		
	}
	
	public void moveCAN(){
		if(state[2]==-1){//IZQ-->DER .SE RESTAN LOS QUE SE MUEVEN.
			state[1]=state[1] - 1 ;
		}
		else{ // DER---->IZQ .SE SUMAN LOS QUE SE MUEVEN.
			state[1]=state[1] + 1 ;
			
		}			
		state[2]=state[2]*(-1);		
	}
	

	
/*
	public List<XYLocation> getPositions() {
		ArrayList<XYLocation> retVal = new ArrayList<XYLocation>();
		for (int i = 0; i < 9; i++) {
			int absPos = getPositionOf(i);
			XYLocation loc = new XYLocation(getXCoord(absPos),
					getYCoord(absPos));
			retVal.add(loc);

		}
		return retVal;
	}

	public void setBoard(List<XYLocation> locs) {
		int count = 0;
		for (int i = 0; i < locs.size(); i++) {
			XYLocation loc = locs.get(i);
			this.setValue(loc.getXCoOrdinate(), loc.getYCoOrdinate(), count);
			count = count + 1;
		}
	}
*/	

	public boolean beAbleToMove(Action where) {
		boolean retVal = true;
		if (where.equals(MANCAN)){
			if(state[2]==-1){//Orilla Izq  IZQ-->DER
				if(state[0]>=1 && state[1]>=1){//Para mover, tiene que haberlos.
					if((3-state[0]+1 >= 3-state[1]+1) && ((state[0]-1 >= state[1]-1 ) || state[0]-1==0)){
						return retVal;
					}
				}
			}
			else{ //DER-->IZQ
				if(3-state[0]>=1 && 3-state[1]>=1){//Para mover, tiene que haberlos.
					if(((3-state[0]-1 >= 3-state[1]-1)|| 3-state[0]-1==0 )&& (state[0]+1 >= state[1]+1)){
						return retVal;
					}			
				}
			}		
		}
		else if (where.equals(MAN2)){
			if(state[2]==-1){//Orilla Izq.IZQ-->DER
				if(state[0]>=2){
					if(((state[0]-2 >= state[1])|| state[0]-2==0)&&(3-state[0]+2 >= 3-state[1])){
						return retVal;
					}		
				}	
			}
			else{//DER-->IZQ
				if(3-state[0]>=2){
					if((state[0]+2>=state[1]) && ((3-state[0]-2 >= 3-state[1])|| 3-state[0]-2 ==0 )){
						return retVal;
					}
				}	
			}		
		}
			
		else if (where.equals(CAN2)){
			if(state[2]==-1){//Orilla Izq.IZQ-->DER
				if(state[1]>=2){
					if(((state[0] >= state[1]-2)||state[0]==0)&&((3-state[0] >= 3-state[1]+2)||3-state[0]==0)){
						return retVal;
					}		
				}	
			}
			else{//DER-->IZQ
				if(3-state[1]>=2){
					if(((state[0]>=state[1]+2) || state[0]==0) && ((3-state[0] >= 3-state[1]-2) || 3-state[0]==0)){
						return retVal;
					}
				}	
			}	
		}
			
		else if (where.equals(MAN)){
			if(state[2]==-1){//Orilla Izq.IZQ-->DER
				if(state[0]>=1){
					if(((state[0]-1 >= state[1])|| state[0]-1 == 0)&&(3-state[0]+1 >= 3-state[1])){
						return retVal;
					}		
				}	
			}
			else{//DER-->IZQ
				if(3-state[0]>=1){
					if((state[0]+1>=state[1]) && ((3-state[0]-1 >= 3-state[1]) || 3- state[0]-1==0)){
						return retVal;
					}
				}	
			}	
		}
			
		else if (where.equals(CAN)){
			if(state[2]==-1){//Orilla Izq.IZQ-->DER
				if(state[1]>=1){
					if(((state[0] >= state[1]-1)|| state[0]==0)&&((3-state[0] >= 3-state[1]+1)|| 3-state[0]==0)){
						return retVal;
					}		
				}	
			}
			else{//DER-->IZQ
				if(3-state[1]>=1){
					if(((state[0]>=state[1]+1)|| state[0]==0) && ((3-state[0] >= 3-state[1]-1))|| 3-state[0]==0){
						return retVal;
					}
				}	
			}
		}
			
		return false;
	}

	
// IMPORTATNTE CAMBIAR ESTO <<<<<<<<<<<<========================	
	
	@Override
	public boolean equals(Object o) {

		if ((o == null) || (this.getClass() != o.getClass())) {
			return false;
		}
		MANCANBoard aBoard = (MANCANBoard) o;
		int [] statetocomp = aBoard.getState();

		for (int i = 0; i < 3; i++) {
			if (this.state[i] != statetocomp[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() { 
		int result;
			if(state[3]==-1){ // El 3er digito del hash siempre va a ser 0 si está en la orilla izq
				result= 100*state[0]+10*state[1];
			}
			else{ // 3er digito será 1 si está en la orilla der.
				result =100*state[0]+10*state[1]+1;
			}		
		return result;
	}

	@Override
	public String toString() {
		String retVal = "MAN:" + state[0] + " CAN: " + state[1] + " ORILLA : " + state[2] + "\n";
		return retVal;
	}

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<=========================================================
	// PRIVATE METHODS
	//
//
//
//	/**
//	 * Note: The graphic representation maps x values on row numbers (x-axis in
//	 * vertical direction).
//	 */
//	
//	private int getXCoord(int absPos) {
//		return absPos / 3;
//	}
//
//	/**
//	 * Note: The graphic representation maps y values on column numbers (y-axis
//	 * in horizontal direction).
//	 */
//	private int getYCoord(int absPos) {
//		return absPos % 3;
//	}
//
//	private int getAbsPosition(int x, int y) {
//		return x * 3 + y;
//	}
//
//	private int getValueAt(int x, int y) {
//		// refactor this use either case or a div/mod soln
//		return state[getAbsPosition(x, y)];
//	}
//
//	private int getGapPosition() {
//		return getPositionOf(0);
//	}
//
//	private int getPositionOf(int val) {
//		int retVal = -1;
//		for (int i = 0; i < 9; i++) {
//			if (state[i] == val) {
//				retVal = i;
//			}
//		}
//		return retVal;
//	}
//
//	private void setValue(int x, int y, int val) {
//		int absPos = getAbsPosition(x, y);
//		state[absPos] = val;
//
//	}

}