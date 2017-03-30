package aima.gui.demo.search;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhiteFunctionFactory;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhitePuzzleBoard;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhitePuzzleGoalTest;
import aima.core.environment.BlackAndWhitePuzzle.BlackAndWhiteStepCostFunction;
import aima.core.environment.BlackAndWhitePuzzle.BWMisplacedTilleHeuristicFunction;
import aima.core.environment.BlackAndWhitePuzzle.BadPositionedHeuristicFunction;
import aima.core.search.framework.GraphSearch;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.TreeSearch;
import aima.core.search.informed.*;
//import aima.core.search.local.SimulatedAnnealingSearch;

public class BlackAndWhiteInformedDemo {
	static BlackAndWhitePuzzleBoard board = new BlackAndWhitePuzzleBoard();;

	public static void main(String[] args) {
		GraphBlackAndWhitePuzzleGreedyBestFirstDemo();
		//TreeBlackAndWhitePuzzleGreedyBestFirstDemo(); Sin control de ciclos: entra en bucle
		GraphBlackAndWhitePuzzleGreedyBestFirstManhattanDemo();
		//TreeBlackAndWhitePuzzleGreedyBestFirstManhattanDemo(); Sin control de ciclos: entra en bucle
		GraphMisplacedBlackAndWhitePuzzleAStarDemo();
		TreeMisplacedBlackAndWhitePuzzleAStarDemo();
		GraphBadPositionedBlackAndWhitePuzzleAStarDemo();
		TreeBadPositionedBlackAndWhitePuzzleAStarDemo();
//		MisplacedBlackAndWhitePuzzleSimulatedAnnealingDemo();
//		BadPositionedBlackAndWhitePuzzleSimulatedAnnealingDemo();
	}

	private static void GraphBlackAndWhitePuzzleGreedyBestFirstDemo() {
		System.out
				.println("\nGraphBlackAndWhitePuzzleDemo Greedy Best First Search (BWMisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(board,
					BlackAndWhiteFunctionFactory.getActionsFunction(),
					BlackAndWhiteFunctionFactory.getResultFunction(),
					new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new GreedyBestFirstSearch(new GraphSearch(),
					new BWMisplacedTilleHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void TreeBlackAndWhitePuzzleGreedyBestFirstDemo() {
		System.out
				.println("\nTreeBlackAndWhitePuzzleDemo Greedy Best First Search (BWMisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(board,
					BlackAndWhiteFunctionFactory.getActionsFunction(),
					BlackAndWhiteFunctionFactory.getResultFunction(),
					new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new GreedyBestFirstSearch(new TreeSearch(),
					new BWMisplacedTilleHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void GraphBlackAndWhitePuzzleGreedyBestFirstManhattanDemo() {
		System.out
				.println("\nGraphBlackAndWhitePuzzleDemo Greedy Best First Search (BadPositionedHeursitic)-->");
		try {
			Problem problem = new Problem(board,
					BlackAndWhiteFunctionFactory.getActionsFunction(),
					BlackAndWhiteFunctionFactory.getResultFunction(),
					new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new GreedyBestFirstSearch(new GraphSearch(),
					new BadPositionedHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void TreeBlackAndWhitePuzzleGreedyBestFirstManhattanDemo() {
		System.out
				.println("\nTreeBlackAndWhitePuzzleDemo Greedy Best First Search (BadPositionedHeursitic)-->");
		try {
			Problem problem = new Problem(board,
					BlackAndWhiteFunctionFactory.getActionsFunction(),
					BlackAndWhiteFunctionFactory.getResultFunction(),
					new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new GreedyBestFirstSearch(new TreeSearch(),
					new BadPositionedHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void GraphMisplacedBlackAndWhitePuzzleAStarDemo() {
		System.out
				.println("\nGraphBlackAndWhitePuzzleDemo AStar Search (BWMisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new AStarSearch(new GraphSearch(),
					new BWMisplacedTilleHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void TreeMisplacedBlackAndWhitePuzzleAStarDemo() {
		System.out
				.println("\nTreeBlackAndWhitePuzzleDemo AStar Search (BWMisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new AStarSearch(new TreeSearch(),
					new BWMisplacedTilleHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void GraphBadPositionedBlackAndWhitePuzzleAStarDemo() {
		System.out
				.println("\nGraphBlackAndWhitePuzzleDemo AStar Search (BadPositionedHeursitic)-->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new AStarSearch(new GraphSearch(),
					new BadPositionedHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void TreeBadPositionedBlackAndWhitePuzzleAStarDemo() {
		System.out
				.println("\nTreeBlackAndWhitePuzzleDemo AStar Search (BadPositionedHeursitic)-->");
		try {
			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
					.getActionsFunction(), BlackAndWhiteFunctionFactory
					.getResultFunction(), new BlackAndWhitePuzzleGoalTest(), new BlackAndWhiteStepCostFunction());
			Search search = new AStarSearch(new TreeSearch(),
					new BadPositionedHeuristicFunction());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
//	private static void MisplacedBlackAndWhitePuzzleSimulatedAnnealingDemo() {
//		System.out.println("\nBlackAndWhitePuzzleDemo Misplaced Simulated Annealing  Search -->");
//		try {
//			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
//					.getActionsFunction(), BlackAndWhiteFunctionFactory
//					.getResultFunction(), new BlackAndWhitePuzzleGoalTest());
//			SimulatedAnnealingSearch search = new SimulatedAnnealingSearch(
//					new BWMisplacedTilleHeuristicFunction());
//			SearchAgent agent = new SearchAgent(problem, search);
//			printActions(agent.getActions());
//			System.out.println("Search Outcome=" + search.getOutcome());
//			System.out.println("Final State=\n" + search.getLastSearchState());
//			printInstrumentation(agent.getInstrumentation());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private static void BadPositionedBlackAndWhitePuzzleSimulatedAnnealingDemo() {
//		System.out.println("\nBlackAndWhitePuzzleDemo BadPositioned Simulated Annealing  Search -->");
//		try {
//			Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
//					.getActionsFunction(), BlackAndWhiteFunctionFactory
//					.getResultFunction(), new BlackAndWhitePuzzleGoalTest());
//			SimulatedAnnealingSearch search = new SimulatedAnnealingSearch(
//					new BadPositionedHeuristicFunction());
//			SearchAgent agent = new SearchAgent(problem, search);
//			printActions(agent.getActions());
//			System.out.println("Search Outcome=" + search.getOutcome());
//			System.out.println("Final State=\n" + search.getLastSearchState());
//			printInstrumentation(agent.getInstrumentation());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

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
