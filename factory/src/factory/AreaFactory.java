package factory;

public class AreaFactory {
	
	public Area getArea(String area){
		if(area.equals("circle"))
			return new Circle();
		if(area.equals("square"))
		return new Square();
		if(area.equals("rectangle"))
			return new Rectangle();
		
		return null;
	}

}
