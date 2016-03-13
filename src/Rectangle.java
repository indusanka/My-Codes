import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


public class Rectangle implements Polygon{

	private Point P1;
	private Point P2;
	private Point P3;
	private Point P4;
	
	
	public void getPoints(Point p1, Point p2, Point p3, Point p4) {
		// TODO Auto-generated method stub
		
		this.P1=p1;
		this.P2=p2;
		this.P3=p3;
		this.P4=p4;
		
		List<Point> addPoints = new ArrayList<Point>();
		
		addPoints.add(P1);
		addPoints.add(P2);
		addPoints.add(P3);
		addPoints.add(P4);
		
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
		double length = P1.distance(P2);
		double breadth = P1.distance(P4);
		
		double recArea = length * breadth;
		double round = Math.round(recArea);

		System.out.println("Area of rectangle:" + round);
		
	}

	@Override
	public void getPoints() {
		// TODO Auto-generated method stub
		
	}
}
