package grandview;

import java.util.List;

public abstract class Graph {
	private int numVertices;
	private int numEdges;
	
	public Graph() {
		numVertices = 0;
		numEdges = 0;
	}
	
	public int getNumVertices() {
		return numVertices;
	}
	
	public int getNumEdges() {
		return numEdges;
	}

	public void addVertex(Vertex v) {
		
		implementAddVertex(v);
		numVertices++ ;
	}
	
	public Edge addEdge(Vertex v, Vertex w) {
		Edge e = implementAddEdge(v, w);
		numEdges++;
		return e;
	}
	
	public abstract void implementAddVertex(Vertex v);
	
	public abstract Edge implementAddEdge(Vertex v, Vertex w);
	
	public abstract List<Edge> getNeighbors(Vertex v);
}
