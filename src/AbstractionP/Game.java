package AbstractionP;

public abstract class Game {
	public String name;
public int width ;
public int height;


public Game() {}
public Game(String name,int height,int width) {
	this.name=name;
	this.width=width;
	this.height=height;
}


	public abstract int calculate();
	public abstract  void display();
}
