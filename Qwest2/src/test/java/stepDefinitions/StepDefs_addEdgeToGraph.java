package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import grandview.Vertex;
import grandview.Edge;
import grandview.GraphAdjList;


public class StepDefs_addEdgeToGraph {

	private String name1, name2;
	private int strength1, strength2;
	
	private Vertex v, w;
	private GraphAdjList adjList = new GraphAdjList();

	@Given("^2 filled in Vertex, and a complete Edge$")
	public void filled_in_Vertex_and_a_complete_Edge() throws Exception {
		System.out.println("given: 2 filled in Vertex, and a complete Edge");
		
		name1 = "Jasper";
		strength1 = 11;
		
		name2 = "Tom";
		strength2 = 6;
		
		v = new Vertex(name1, 0);
		v.setStrength(strength1);
		v.addToStuffCarried("sword");
		
		w = new Vertex(name2, 1);
		w.setStrength(strength2);
		w.addToStuffCarried("sack");
	}
	
	@When("^Add the  name, strength and carried item to a vertex$")
	public void Add_the_name_strength_and_carried_item_to_a_vertex() throws Exception {
		System.out.println("when: Add the  name, strength and carried item to a vertex");
		
		adjList.addEdge(v, w);
	}
	
	@Then("^the Graph should reflect the new relationship$")
	public void the_Graph_should_reflect_the_new_relationship() throws Exception {
		System.out.println("Then: the Graph should reflect the new relationship");
		
		int numVerts = adjList.getNumVertices();
		assertEquals(2, numVerts);
	
		adjList.showGraph();
		
		List<Edge> lst = adjList.getNeighbors(v);
		Edge a = lst.get(0);
		System.out.println(a);
		assertEquals("Jasper", a.beginning.name());
		assertEquals("Tom", a.end.name());
		
	}
}
