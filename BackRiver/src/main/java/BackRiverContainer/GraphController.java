package BackRiverContainer;


import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;



import grandview.Edge;
import grandview.Vertex;
import grandview.GraphAdjList;

@RestController

public class GraphController {
	 private static final String template = "%s!";
	    private final AtomicInteger counter = new AtomicInteger();

	    private GraphAdjList adjListMap = new GraphAdjList();
	    
	    @RequestMapping("/getVertexTest")
	    public Vertex getVertexTest(@RequestParam(value="name", defaultValue="Jim") String name) {
	    	
	    	Vertex v = new Vertex();
	    	v.setName(name);
	    	System.out.println(v.getName());
	    	
	    	v.setStrength(11);
	    	System.out.println(v.getStrength());
	    	
	    	v.setID(counter.incrementAndGet());
	    	System.out.println(v.getId());
	    	
	    	v.addToStuffCarried("wand");
	    	v.addToStuffCarried("sword");
	    	System.out.println(v.getCarriedStuff());
	    	
	        return v;
	    }
	    
	    @RequestMapping("/getEdgeTest")
	    public Edge getEdgeTest() {
	    	
	    	Vertex v, w;
	    	
	    	v = new Vertex("joe", 1);
	    	w = new Vertex("black", 2);
	    	
	    	Edge e = new Edge(v, w);
	    	
	    	return e;
	    }
	    
	    @RequestMapping("/getGraphTest")
	    public GraphAdjList getGraphTest() {
	    	
	    	GraphAdjList adjList = new GraphAdjList();
	    	
	    	Vertex v, w;
	    	
	    	v = new Vertex("joe", 1);
	    	v.addToStuffCarried("wand");
	    	v.setStrength(11);
	    	
	    	w = new Vertex("black", 2);
	    	w.addToStuffCarried("sword");
	    	w.setStrength(10);
	    	
	    	Edge e = new Edge(v, w);
	    	
	    	adjList.addVertex(v);
	    	
	    	adjList.addEdge(e);
	    	
	    	return adjList;
	    }
	    

	    @CrossOrigin(origins = "http://localhost:3000")
	    @GetMapping("/getQwestTest")
	    public GraphAdjList getQuestTest() {
	    	
	    	GraphAdjList adjList = new GraphAdjList();
			
			Vertex vJ = new Vertex("Jasper", 0);
			vJ.addToStuffCarried("sword");

			Vertex vT = new Vertex("Tom", 1);
			vT.addToStuffCarried("sack");
			vT.setStrength(11);
			
			Vertex vE = new Vertex("Emma", 2);
			vE.addToStuffCarried("wand");
			vE.setStrength(11);
			
			Vertex vC = new Vertex("Charlie", 3);
			vC.addToStuffCarried("wand");
			vC.setStrength(7);
			
			Vertex vB = new Vertex("Ben", 4);
			vB.addToStuffCarried("sandwich");
			vB.setStrength(17);
			
			Vertex vO = new Vertex("Olivia", 5);
			vO.addToStuffCarried("ring");
			vO.setStrength(17);
			
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
			
			return adjList;
	    }
	    
	    @CrossOrigin(origins = "http://localhost:3000")
	    @GetMapping("/AddVertex")
	    public String AddVertex(@RequestParam(value="vertexName", defaultValue="Jim") String name) {
	    	
	    	Vertex v = new Vertex();
	    	v.setName(name);
	    	adjListMap.addVertex(v);
	    	
	    	return v.getName();
	    }
	    
	    @CrossOrigin(origins = "http://localhost:3000")
	    @GetMapping("/AddEdge")
	    public String AddEdge(@RequestParam String vertexName1, @RequestParam String vertexName2) {
	    	
	
	        Vertex v = new Vertex();
	    	v.setName(vertexName1);
	    	
	    	Vertex w = new Vertex();
	    	w.setName(vertexName2);
	    	
	    	adjListMap.addEdge(v, w);
	    	
	    	return "Edge Added";
	    }
	    
	    @CrossOrigin(origins = "http://localhost:3000")
	    @GetMapping("/getGraph")
	    public GraphAdjList getGraph() {
	    	return adjListMap;
	    }
	    
}
