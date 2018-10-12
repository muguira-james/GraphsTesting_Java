package grandview;


import java.util.ArrayList;


public class Vertex {
	private String _name;
	private int _strength;
	private ArrayList<String> _carries;
	private int _ID;
	
	public String name() { return _name; }
	public ArrayList<String> getCarriedStuff() { return _carries; }
	public int id() { return _ID; }
	public int strength() { return _strength; }
	
	public void setName(String n) { _name = n; }
	public void addToStuffCarried(String thing) { _carries.add(thing); }
	public void setID(int id) { _ID = id; }
	public void setStrength(int s) { _strength = s; }
	
	public void setVertex(String name, int id) { _name = name; _ID = id; }
	
	public Vertex(String nm, int initialID) { _ID = initialID; _name = nm; }
	public Vertex() { _ID = 0; _name = ""; }
}
