import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;


public class CreatePolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle();
		t1.getPoints(new Point(0, 0), new Point(10, 0), new Point(0, 10));
		
		Triangle t2 = new Triangle();
		t2.getPoints(new Point(0, 0), new Point(10, 30), new Point(40, 80));
	
		Rectangle r1 = new Rectangle();
		r1.getPoints(new Point(0, 0), new Point(6, 0), new Point(6, 7),new Point(0, 7));
		
		Rectangle r2 = new Rectangle();
		r2.getPoints(new Point(0, 0), new Point(5, 0), new Point(5, 5), new Point(0, 5));
		
		
		
		ArrayList<Polygon> al = new ArrayList<Polygon>();

		al.add(t1);
		al.add(t2);
		al.add(r1);
		al.add(r2);
		
		Iterator<Polygon> itr = al.iterator();
		
		System.out.println();
		System.out.println("Total 4 Polygons are added to Collection:");
		System.out.println("-------------------------------------------");
		System.out.println();
		
		while (itr.hasNext()) {
			Polygon element = itr.next();
			element.getArea();
			System.out.println();			
		}
		
		System.out.println("-------------------------------------------");
	}

}
