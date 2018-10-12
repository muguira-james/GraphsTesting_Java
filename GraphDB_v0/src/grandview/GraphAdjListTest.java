package grandview;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;


import org.junit.jupiter.api.Test;


class GraphAdjListTest {

	@Test
	void test() {
		System.out.println("basic test\n");
		GraphAdjList adjList = new GraphAdjList();
		
		Vertex v = new Vertex("Jasper", 0);
		adjList.addVertex(v);
		
		int numVerts = adjList.getNumVertices();
		assertEquals(1, numVerts);
		
		Vertex w = new Vertex("Tom", 1);
		adjList.addVertex(w);
		
		adjList.addEdge(v, w);
		
		numVerts = adjList.getNumVertices();
		assertEquals(2, numVerts);
	
		adjList.showGraph();
		
		List<Edge> lst = adjList.getNeighbors(v);
		Edge a = lst.get(0);
		System.out.println(a);
		assertEquals("Jasper", a.beginning.name());
		assertEquals("Tom", a.end.name());
		
		
	}
	

	@Test
	void TestbiggerGraph() {
		GraphAdjList adjList = new GraphAdjList();
		
		Vertex vJ = new Vertex("Jasper", 0);
		Vertex vT = new Vertex("Tom", 1);
		Vertex vE = new Vertex("Emma", 2);
		Vertex vC = new Vertex("Charlie", 3);
		Vertex vB = new Vertex("Ben", 4);
		Vertex vO = new Vertex("Olivia", 5);
		
		adjList.addVertex(vJ);
		adjList.addVertex(vT);
		adjList.addVertex(vE);
		adjList.addVertex(vC);
		adjList.addVertex(vB);
		adjList.addVertex(vO);
		
		adjList.addEdge(vJ, vT);
		
		adjList.addEdge(vT, vC);
		adjList.addEdge(vT, vO);
		adjList.addEdge(vT, vB);
		
		adjList.addEdge(vE, vT);
		adjList.addEdge(vE, vO);
		adjList.addEdge(vE, vB);
		
		adjList.addEdge(vC, vJ);
		adjList.addEdge(vC, vE);
		
		adjList.addEdge(vB, vJ);
		
		adjList.addEdge(vO, vC);
		
		adjList.showGraph();
		
	}

}
