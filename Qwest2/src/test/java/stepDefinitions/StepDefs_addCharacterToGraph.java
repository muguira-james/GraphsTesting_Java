package stepDefinitions;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import grandview.Vertex;
import grandview.GraphAdjList;

public class StepDefs_addCharacterToGraph {
	private String name;
	private int strength;
	private List<String> carried = new ArrayList<String>();
	private GraphAdjList adjList = new GraphAdjList();
	private Vertex v;
	

	@Given("^a filled in Vertex$")
	public void a_filled_in_Vertex() throws Exception {
		System.out.println("given: a filled in Vertex");
		
		name = "Jasper";
		strength = 11;
		carried.add("sword");
		
		v = new Vertex(name, 0);
		v.setStrength(strength);
		v.addToStuffCarried("sword");
	}
	
	@When("^I add it to the Graph$")
	public void I_add_it_to_the_Graph() throws Exception {
		System.out.println("when: I add it to the Graph");
		
		adjList.addVertex(v);
	}
	
	@Then("^Test to see if the vertex is initialized properly$")
	public void Test_to_see_if_the_vertex_is_initialized_properly() throws Exception {
		System.out.println("given: Test to see if the vertex is initialized properly");
		
		int numVerts = adjList.getNumVertices();
		assertEquals(1, numVerts);
	}
	
}
