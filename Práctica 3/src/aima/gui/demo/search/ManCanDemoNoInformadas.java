package aima.gui.demo.search;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.environment.ManCan.ManCanGoalTest;
import aima.core.environment.ManCan.ManCanBoard;
import aima.core.environment.ManCan.ManCanFunctionFactory;
import aima.core.search.framework.GraphSearch;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.TreeSearch;
import aima.core.search.uninformed.BreadthFirstSearch;
import aima.core.search.uninformed.DepthFirstSearch;
import aima.core.search.uninformed.DepthLimitedSearch;
import aima.core.search.uninformed.IterativeDeepeningSearch;
import aima.core.search.uninformed.UniformCostSearch;

/**
 * @author Ravi Mohan
 * 
 */

public class ManCanDemoNoInformadas {
	static ManCanBoard board = new ManCanBoard();
	public static void main(String[] args) {
		ManCanDLSDemo();
		ManCanIDLSDemo();
		ManCanBFSDemo();
		ManCanUniformCostDemo();
		ManCanDFSGraphDemo();
		//ManCanDFSTreeDemo(); Sin control de ciclos: entra en bucle
	}

	private static void ManCanDLSDemo() {
		System.out.println("\nManCanDemo recursive DLS (9) -->");
		try {
			Problem problem = new Problem(board, ManCanFunctionFactory
					.getActionsFunction(), ManCanFunctionFactory
					.getResultFunction(), new ManCanGoalTest());
			Search search = new DepthLimitedSearch(9);
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void ManCanIDLSDemo() {
		System.out.println("\nManCanDemo Iterative DLS -->");
		try {
			Problem problem = new Problem(board, ManCanFunctionFactory
					.getActionsFunction(), ManCanFunctionFactory
					.getResultFunction(), new ManCanGoalTest());
			Search search = new IterativeDeepeningSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void ManCanBFSDemo() {
		System.out.println("\nManCanDemo BFS -->");
		try {
			Problem problem = new Problem(board, ManCanFunctionFactory
					.getActionsFunction(), ManCanFunctionFactory
					.getResultFunction(), new ManCanGoalTest());
			Search search = new BreadthFirstSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void ManCanUniformCostDemo() {
		System.out.println("\nManCanDemo UniformCost -->");
		try {
			Problem problem = new Problem(board, ManCanFunctionFactory
					.getActionsFunction(), ManCanFunctionFactory
					.getResultFunction(), new ManCanGoalTest());
			Search search = new UniformCostSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void ManCanDFSGraphDemo() {
		System.out.println("\nManCanDemo DFS w/ Graph -->");
		try {
			Problem problem = new Problem(board, ManCanFunctionFactory
					.getActionsFunction(), ManCanFunctionFactory
					.getResultFunction(), new ManCanGoalTest());
			Search search = new DepthFirstSearch(new GraphSearch());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void ManCanNDFSTreeDemo() {
		System.out.println("\nManCanDemo DFS w/ Tree -->");
		try {
			Problem problem = new Problem(board, ManCanFunctionFactory
					.getActionsFunction(), ManCanFunctionFactory
					.getResultFunction(), new ManCanGoalTest());
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