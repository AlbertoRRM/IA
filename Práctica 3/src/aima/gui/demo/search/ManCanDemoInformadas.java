package aima.gui.demo.search;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.environment.ManCan.*;
import aima.core.search.framework.GraphSearch;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.TreeSearch;
import aima.core.search.informed.*;

public class ManCanDemoInformadas {
		static ManCanBoard board = new ManCanBoard();;

		public static void main(String[] args) {
			GraphManCanGreedyBestFirstDemo();
			TreeManCanGreedyBestFirstDemo();
			GraphManCanGreedyBestFirstNonAttackDemo();
			TreeManCanGreedyBestFirstNonAttackDemo();
			GraphManCanInfiniteBoatsAStarDemo();
			TreeManCanInfiniteBoatsAStarDemo();
			GraphManCanNonAttackAStarDemo();
			TreeManCanNonAttackAStarDemo();
		}

		private static void GraphManCanGreedyBestFirstDemo() {
			System.out
					.println("\nGraphManCanDemo Greedy Best First Search (Inifinite Boats)-->");
			try {
				Problem problem = new Problem(board,
						ManCanFunctionFactory.getActionsFunction(),
						ManCanFunctionFactory.getResultFunction(),
						new ManCanGoalTest());
				Search search = new GreedyBestFirstSearch(new GraphSearch(),
						new InfiniteBoatsHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static void TreeManCanGreedyBestFirstDemo() {
			System.out
					.println("\nTreeBlackAndWhitePuzzleDemo Greedy Best First Search (Infinite Boats)-->");
			try {
				Problem problem = new Problem(board,
						ManCanFunctionFactory.getActionsFunction(),
						ManCanFunctionFactory.getResultFunction(),
						new ManCanGoalTest());
				Search search = new GreedyBestFirstSearch(new TreeSearch(),
						new InfiniteBoatsHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void GraphManCanGreedyBestFirstNonAttackDemo() {
			System.out
					.println("\nGraphManCanDemo Greedy Best First Search (NonAttack)-->");
			try {
				Problem problem = new Problem(board,
						ManCanFunctionFactory.getActionsFunction(),
						ManCanFunctionFactory.getResultFunction(),
						new ManCanGoalTest());
				Search search = new GreedyBestFirstSearch(new GraphSearch(),
						new NonAttackHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		private static void TreeManCanGreedyBestFirstNonAttackDemo() {
			System.out
					.println("\nTreeManCanDemo Greedy Best First Search (NonAttack)-->");
			try {
				Problem problem = new Problem(board,
						ManCanFunctionFactory.getActionsFunction(),
						ManCanFunctionFactory.getResultFunction(),
						new ManCanGoalTest());
				Search search = new GreedyBestFirstSearch(new TreeSearch(),
						new NonAttackHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void GraphManCanInfiniteBoatsAStarDemo() {
			System.out
					.println("\nGraphManCanDemo AStar Search (Infinite Boats)-->");
			try {
				Problem problem = new Problem(board, ManCanFunctionFactory
						.getActionsFunction(), ManCanFunctionFactory
						.getResultFunction(), new ManCanGoalTest());
				Search search = new AStarSearch(new GraphSearch(),
						new InfiniteBoatsHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		private static void TreeManCanInfiniteBoatsAStarDemo() {
			System.out
					.println("\nTreeBlackAndWhitePuzzleDemo AStar Search (Infinite Boats)-->");
			try {
				Problem problem = new Problem(board, ManCanFunctionFactory
						.getActionsFunction(), ManCanFunctionFactory
						.getResultFunction(), new ManCanGoalTest());
				Search search = new AStarSearch(new TreeSearch(),
						new InfiniteBoatsHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		private static void GraphManCanNonAttackAStarDemo() {
			System.out
					.println("\nGraphManCanNonAttackDemo AStar Search (Non Attack)-->");
			try {
				Problem problem = new Problem(board, ManCanFunctionFactory
						.getActionsFunction(), ManCanFunctionFactory
						.getResultFunction(), new ManCanGoalTest());
				Search search = new AStarSearch(new GraphSearch(),
						new NonAttackHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		private static void TreeManCanNonAttackAStarDemo() {
			System.out
					.println("\nTreeManCanNonAttackDemo AStar Search (Non Attack)-->");
			try {
				Problem problem = new Problem(board, ManCanFunctionFactory
						.getActionsFunction(), ManCanFunctionFactory
						.getResultFunction(), new ManCanGoalTest());
				Search search = new AStarSearch(new TreeSearch(),
						new NonAttackHeuristicFunction());
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		
//		private static void MisplacedBlackAndWhitePuzzleSimulatedAnnealingDemo() {
//			System.out.println("\nBlackAndWhitePuzzleDemo Misplaced Simulated Annealing  Search -->");
//			try {
//				Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
//						.getActionsFunction(), BlackAndWhiteFunctionFactory
//						.getResultFunction(), new BlackAndWhitePuzzleGoalTest());
//				SimulatedAnnealingSearch search = new SimulatedAnnealingSearch(
//						new BWMisplacedTilleHeuristicFunction());
//				SearchAgent agent = new SearchAgent(problem, search);
//				printActions(agent.getActions());
//				System.out.println("Search Outcome=" + search.getOutcome());
//				System.out.println("Final State=\n" + search.getLastSearchState());
//				printInstrumentation(agent.getInstrumentation());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
	//	
//		private static void BadPositionedBlackAndWhitePuzzleSimulatedAnnealingDemo() {
//			System.out.println("\nBlackAndWhitePuzzleDemo BadPositioned Simulated Annealing  Search -->");
//			try {
//				Problem problem = new Problem(board, BlackAndWhiteFunctionFactory
//						.getActionsFunction(), BlackAndWhiteFunctionFactory
//						.getResultFunction(), new BlackAndWhitePuzzleGoalTest());
//				SimulatedAnnealingSearch search = new SimulatedAnnealingSearch(
//						new BadPositionedHeuristicFunction());
//				SearchAgent agent = new SearchAgent(problem, search);
//				printActions(agent.getActions());
//				System.out.println("Search Outcome=" + search.getOutcome());
//				System.out.println("Final State=\n" + search.getLastSearchState());
//				printInstrumentation(agent.getInstrumentation());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

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
