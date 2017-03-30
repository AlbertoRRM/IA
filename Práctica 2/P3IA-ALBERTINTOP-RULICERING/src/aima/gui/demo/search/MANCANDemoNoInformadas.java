package aima.gui.demo.search;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.environment.MANCAN.MANCANBoard;
import aima.core.environment.MANCAN.MANCANFunctionFactory;
import aima.core.environment.MANCAN.MANCANGoalTest;
import aima.core.environment.MANCAN.ManhattanHeuristicFunction;
import aima.core.environment.MANCAN.MisplacedTilleHeuristicFunction;
import aima.core.environment.eightpuzzle.EightPuzzleBoard;
import aima.core.environment.eightpuzzle.EightPuzzleFunctionFactory;
import aima.core.environment.eightpuzzle.EightPuzzleGoalTest;
import aima.core.search.framework.GraphSearch;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.informed.AStarSearch;
import aima.core.search.informed.GreedyBestFirstSearch;
import aima.core.search.local.SimulatedAnnealingSearch;
import aima.core.search.uninformed.DepthLimitedSearch;
import aima.core.search.uninformed.IterativeDeepeningSearch;

/**
 * @author Ravi Mohan
 * 
 */

public class MANCANDemoNoInformadas {
	static MANCANBoard board = new MANCANBoard();
	
	public static void main(String[] args) {
		MANCANDLSDemoNoInformadas();
		MANCANIDLSDemoNoInformadas();
//		MANCANGreedyBestFirstDemo();
//		MANCANGreedyBestFirstManhattanDemo();
//		MANCANAStarDemo();
//		MANCANAStarManhattanDemo();
//		MANCANSimulatedAnnealingDemo();
	}

	private static void MANCANDLSDemoNoInformadas() {
		System.out.println("\n MANCANDemo recursive DLS (9) -->");
		try {
			Problem problem = new Problem(board, MANCANFunctionFactory
					.getActionsFunction(), MANCANFunctionFactory
					.getResultFunction(), new MANCANGoalTest());
			Search search = new DepthLimitedSearch(12); //Juega con la profundidad y verah.
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void MANCANIDLSDemoNoInformadas() {
		System.out.println("\n MANCANDemo Iterative DLS -->");
		try {
			Problem problem = new Problem(board, MANCANFunctionFactory
					.getActionsFunction(), MANCANFunctionFactory
					.getResultFunction(), new MANCANGoalTest());
			Search search = new IterativeDeepeningSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
/*
	private static void MANCANGreedyBestFirstDemo() {
		System.out
				.println("\n MANCAN Greedy Best First Search (MisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(board, MANCANFunctionFactory
					.getActionsFunction(), MANCANFunctionFactory
					.getResultFunction(), new MANCANGoalTest());
			Search search = new GreedyBestFirstSearch(new GraphSearch(),
					new MisplacedTilleHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void MANCANGreedyBestFirstManhattanDemo() {
		System.out
				.println("\n MANCAN Greedy Best First Search (ManhattanHeursitic)-->");
		try {
			Problem problem = new Problem(board, MANCANFunctionFactory
					.getActionsFunction(), MANCANFunctionFactory
					.getResultFunction(), new MANCANGoalTest());
			Search search = new GreedyBestFirstSearch(new GraphSearch(),
					new ManhattanHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void MANCANAStarDemo() {
		System.out
				.println("\n MANCAN AStar Search (MisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(board, MANCANFunctionFactory
					.getActionsFunction(), MANCANFunctionFactory
					.getResultFunction(), new MANCANGoalTest());
			Search search = new AStarSearch(new GraphSearch(),
					new MisplacedTilleHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void MANCANSimulatedAnnealingDemo() {
		System.out.println("\n MANCAN Simulated Annealing  Search -->");
		try {
			Problem problem = new Problem(board, MANCANFunctionFactory
					.getActionsFunction(), MANCANFunctionFactory
					.getResultFunction(), new MANCANGoalTest());
			SimulatedAnnealingSearch search = new SimulatedAnnealingSearch(
					new ManhattanHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			System.out.println("Search Outcome=" + search.getOutcome());
			System.out.println("Final State=\n" + search.getLastSearchState());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void MANCANAStarManhattanDemo() {
		System.out
				.println("\n MANCAN AStar Search (ManhattanHeursitic)-->");
		try {
			Problem problem = new Problem(board, MANCANFunctionFactory
					.getActionsFunction(), MANCANFunctionFactory
					.getResultFunction(), new MANCANGoalTest());
			Search search = new AStarSearch(new GraphSearch(),
					new ManhattanHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
*/
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