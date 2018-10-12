package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import grandview.Vertex;
import grandview.GraphAdjList;

public class StepDefs_showGraph {


	@Then("^show Graph@")
	public void showGraph() throws Exception {
		System.out.println("then: showGraph");
			
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
