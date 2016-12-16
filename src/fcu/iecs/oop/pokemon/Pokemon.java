package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	
	private final String name;
    private final Pokemon type;
    private int cp;
    
	public Pokemon(String name, Pokemon type, int cp) {
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public Pokemon getType() {
		return type;
	}
	
	public abstract void attack();
}
