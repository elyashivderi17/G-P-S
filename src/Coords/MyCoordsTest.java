package Coords;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import Geom.Point3D;



class MyCoordsTest {


	@Test
	void isValid_GPS_PointTest() {

		MyCoords c=new MyCoords();

		Point3D p=new Point3D(50,5);

		boolean x=c.isValid_GPS_Point(p);

		assertTrue(x);

	}

	

	@Test
	void addTest() {

		MyCoords c=new MyCoords();

		Point3D p=new Point3D(34.8085 ,32.16275);

		Point3D v=new Point3D(500, 500);

	

		Point3D out = c.add(p, v);

//		the right answer as shown in google earth (with those parameters)

		Point3D rightAns= new Point3D(34.813006686487164,32.16656500793215, 6356752.314199897); 

		

		assertEquals(out.toString(),rightAns.toString());

		

}

	@Test
	void distance3dTest() {

		MyCoords c=new MyCoords();

		// p=new Point3D(34.814167,32.171111,0 );

		//Point3D p1= new Point3D(34.819444,32.171111,0);

		Point3D p1= new Point3D(0,0,0);
		
		Point3D p=new Point3D(1,2,3);
		double dis = c.distance3d(p, p1);

		System.out.println("dis: "+dis);
		// the real distance between the two points
		double rightAns = 0.5277; 

		

	assertEquals(dis,rightAns,0);

	}

	@Test
	void vector3DTest() {

		MyCoords c=new MyCoords();

		Point3D p=new Point3D(34.8085 ,32.16275);

		Point3D p1= new Point3D(34.813006686487164,32.16656500793215, 6356752.314199897); 

		Point3D v = c.vector3D(p, p1);

		Point3D rightAns = new Point3D(500,500);

		assertEquals(v.x(),rightAns.x(), 0.01);

		assertEquals(v.y(),rightAns.y(), 0.01);

		assertEquals(v.z(),rightAns.z(), 0.01);





	}

	@Test
	void azimuth_elevation_distTest() {

		MyCoords c=new MyCoords();

		Point3D p=new Point3D(34.8085 ,32.16275);

	Point3D p1= new Point3D(34.813006686487164,32.16656500793215, 6356752.314199897);

	double [] arr = c.azimuth_elevation_dist(p, p1);

		

		

	}



}