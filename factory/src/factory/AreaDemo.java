package factory;

public class AreaDemo {

	public static void main(String[] args) {
		
		AreaFactory a = new AreaFactory();
		Area c = a.getArea("circle");
		c.area();
		Area s = a.getArea("square");
		s.area();
		Area r = a.getArea("rectangle");
		r.area();

	}

}
