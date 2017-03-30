package aima.core.environment.BlackAndWhitePuzzle;

import aima.core.agent.Action;
import aima.core.search.framework.StepCostFunction;

public class BlackAndWhiteStepCostFunction implements StepCostFunction {
	public double c(Object stateFrom, Action action, Object stateTo) {
		if (BlackAndWhitePuzzleBoard.DJUMPR.equals(action) || BlackAndWhitePuzzleBoard.DJUMPL.equals(action))
			return 2;
		else
			return 1;
	}
}
