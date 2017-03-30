package aima.gui.demo.search;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhiteFunctionFactory;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhitePuzzleBoard;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhitePuzzleGoalTest;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhiteStepCostFunction;
import aima.core.search.framework.GraphSearch;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.TreeSearch;
import aima.core.search.uninformed.*;


public class BlackAndWhiteNotInformedDemo {
	static BlackAndWhitePuzzleBoard board = new BlackAndWhitePuzzleBoard();;

	public static void main(String[] args) {
		BlackAndWhitePuzzleDLSDemo();
		BlackAndWhitePuzzleIDLSDemo();
		BlackAndWhitePuzzleBFSDemo();
		BlackAndWhitePuzzleUniformCostDemo();
		BlackAndWhitePuzzleDFSGraphDemo();
		//BlackAndWhitePuzzleDFSTreeDemo(); Sin control de ciclos: entra en bucle.
	}

	private static void BlackAndWhitePuzzleDLSDemo() {
		System.out.println("\nBlackAndWhitePuzzleDemo recursive DLS (9) -->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest() ,new BlackAndWhiteStepCostFunction());
			Search search = new DepthLimitedSearch(9);
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void BlackAndWhitePuzzleIDLSDemo() {
		System.out.println("\nBlackAndWhitePuzzleDemo Iterative DLS -->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new IterativeDeepeningSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void BlackAndWhitePuzzleBFSDemo() {
		System.out.println("\nBlackAndWhitePuzzleDemo BFS -->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new BreadthFirstSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void BlackAndWhitePuzzleUniformCostDemo() {
		System.out.println("\nBlackAndWhitePuzzleDemo UniformCost -->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new UniformCostSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void BlackAndWhitePuzzleDFSGraphDemo() {
		System.out.println("\nBlackAndWhitePuzzleDemo DFS w/ Graph -->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new DepthFirstSearch(new GraphSearch());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void BlackAndWhitePuzzleDFSTreeDemo() {
		System.out.println("\nBlackAndWhitePuzzleDemo DFS w/ Tree -->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new DepthFirstSearch(new TreeSearch());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	private static void printInstrumentation(Properties properties) {
		Iterator<Object> keys = properties.keySet().iterator();
		while (keys.hasNext()) {
			String key = (String) keys.next();
			String property = properties.getProperty(key);
			System.out.println(key + " : " + property);
		}

	}

	private static void printActions(List<Action> actions) {
		for (int i = 0; i < actions.size(); i++) {
			String action = actions.get(i).toString();
			System.out.println(action);
		}
	}

}