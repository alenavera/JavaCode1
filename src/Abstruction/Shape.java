package Abstruction;

public abstract  class Shape extends SuperShape {
public String name;
public String area;


public Shape() {}


public Shape(String name) {
	this.name=name;
}

public abstract  double calculateArea() ;
public abstract  void draw();
public void SuperDraw() {
	System.out.println("Super Drawing...");
}
}


