package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import grandview.Vertex;
import grandview.GraphAdjList;

public class StepDefs_createCharacter {
	
	private String name;
	private int strength;
	private List<String> carried = new ArrayList<String>();
	
	private Vertex v;

	@Given("^A Name, a strength and something to carry$")
	public void A_Name_A_Strength_and_something_to_Carry() throws Exception {
		System.out.println("given: A Name, a strength and something to carry");
		
		name = "Jasper";
		strength = 11;
		carried.add("sword");
	}
	
	@When("^Add the  name, strength and carried item to a vertex$")
	public void Add_the_name_strength_and_carried_item_to_a_vertex() throws Exception {
		System.out.println("when: Add the  name, strength and carried item to a vertex");
		
		v = new Vertex(name, 0);
		v.setStrength(11);
		v.addToStuffCarried("sword");
	}
	
	@Then("^Test to see if the vertex is initialized properly$")
	public void Test_to_see_if_the_vertex_is_initialized_properly() throws Exception {
		System.out.println("given: Test to see if the vertex is initialized properly");
		
		
		String n = v.name();
		int strength = v.strength();
		ArrayList<String> items = v.getCarriedStuff();
		
		assertEquals("Japser", n);
		assertEquals(11, strength);
		assertEquals("sword", items.get(0));
		
		
	}
	
}