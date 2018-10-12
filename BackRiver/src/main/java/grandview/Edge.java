package grandview;

public class Edge {
	public Vertex beginning;
	public Vertex end;
	
	public Edge(Vertex v, Vertex w) { beginning = v; end = w; }

	@Override
	public String toString() {
		return "Edge [beginning=" + beginning.getName() + ", end=" + end.getName() + "]";
	}
	
	
}
