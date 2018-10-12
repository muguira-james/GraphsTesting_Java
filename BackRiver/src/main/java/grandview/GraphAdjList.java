package grandview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphAdjList extends Graph {

	private Map<String, ArrayList<Edge>> adjListMap = new HashMap<String, ArrayList<Edge>>();
	
	@Override
	public void implementAddVertex(Vertex v) {
		// add a new vertex (or node) to the graph

		ArrayList<Edge> neighbors = new ArrayList<Edge>();

		adjListMap.put(v.getName(), neighbors);

	}

	@Override
	public Edge implementAddEdge(Vertex v, Vertex w) {
		Edge e = new Edge(v, w);
		(adjListMap.get(v.getName())).add(e);
		return e;
	}

	@Override
	public Edge implementAddEdge(Edge e) {

		(adjListMap.get(e.beginning.getName())).add(e);
		return e;
	}
	
	@Override
	public List<Edge> getNeighbors(Vertex v) {
		// show the neighbors of the given node	
		List<Edge> e = adjListMap.get(v.getName());
		return e;
	}
	
	public void printNeighbors(Vertex v) {
		// show the neighbors of the given node
		
		System.out.format("Vertex %d: \n", v.getName());
		for (Edge neighbor : adjListMap.get(v.getName())) {
			System.out.format("%s: has neighbor: %s\n", neighbor.beginning, neighbor.end);
		}
		
	}
	
	public void showGraph() {
		System.out.println("-----------------------");
		
		Set<String> keys = adjListMap.keySet();
		for (String n : keys) {
			if ( (adjListMap.get(n)).size() == 0) continue;
			
			System.out.format("Vertex name: %s\n", n);

			for (Edge neighbor : adjListMap.get(n)) {
				System.out.format("\tis connected to: %s\n", neighbor.end.getName());
			}
		}	

		System.out.println("-----------------------");
	}

	public Map<String, ArrayList<Edge>> getGraph() { return adjListMap; }


}
