package Coords;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Geom.Point3D;



class MyCoordsTest {



	Point3D Point_1 = new Point3D(32.103315,35.209039,670);

	Point3D Point_2 = new Point3D(32.106352,35.205225,650);

	Point3D temp = new Point3D(337.6989921,-359.2492069,-20);

	MyCoords vec = new MyCoords();





	@Test

	void testAdd() {

		Point3D ans = new Point3D(32.10635199999893,35.205225000003225,650);

		assertTrue(ans.equals(vec.add(Point_1, temp)));

	}



	@Test

	void testDistance3d() {

		assertEquals(493.052,vec.distance3d(Point_1, Point_2),0.1);

	}



	@Test
	void testVector3D() {
		
		Point3D ans = new Point3D(337.69899206128815,-359.24920693881893,-20.0);

		assertTrue(ans.equals(vec.vector3D(Point_1, Point_2)));
	}



	@Test
	void testAzimuth_elevation_dist() {

		double ans[] =  {313.229882305353, -89.98603287888018, 493.0523318324134};

		double array[] =vec.azimuth_elevation_dist(Point_1, Point_2);

		assertEquals(Arrays.toString(ans),Arrays.toString(array));

	}



	@Test

	void testIsValid_GPS_Point() {

		assertTrue(vec.isValid_GPS_Point(Point_1)&&vec.isValid_GPS_Point(Point_1));
	}
}