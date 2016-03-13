import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


public class Triangle implements Polygon{
	
	private Point P1;
	private Point P2;
	private Point P3;
	
	public void getPoints(Point p1, Point p2, Point p3) {
		// TODO Auto-generated method stub
		
		this.P1=p1;
		this.P2=p2;
		this.P3=p3;
		
		List<Point> addPoints = new ArrayList<Point>();
		
		addPoints.add(P1);
		addPoints.add(P2);
		addPoints.add(P3);
		
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
		double s1 = P1.distance(P2);
		double s2 = P2.distance(P3);
		double s3 = P3.distance(P1);
		
		double semiPerimeter = (s1 + s2 + s3) / 2;		
		double area = semiPerimeter * (semiPerimeter - s1) * (semiPerimeter - s2) * (semiPerimeter - s3);
		double triArea = Math.sqrt(area);
		double round = Math.round(triArea);
		
		System.out.println("Area of triangle:" + round);
		
	}

	@Override
	public void getPoints() {
		// TODO Auto-generated method stub
		
	}
	
}
