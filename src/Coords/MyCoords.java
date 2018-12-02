package Coords;

import Geom.Point3D;

import java.util.Hashtable;

import java.util.Map;

import com.sun.javafx.geom.AreaOp.AddOp;

import com.sun.javafx.scene.paint.GradientUtils.Point;

import Coords.coords_converter;



public class MyCoords implements coords_converter {

	

	final static int world = 6371000;



	public Point3D add(Point3D gps, Point3D local_vector_in_meter) {

		double comp = local_vector_in_meter.x() / world;

		double lat = gps.x() + (comp * 180/Math.PI);

		double comp2 = (local_vector_in_meter.y() + (comp * 180 / Math.PI));

		double lon = gps.y() + (comp2 * 180 / Math.PI);

		double alt = gps.z() + local_vector_in_meter.z();

		return new Point3D(lat, lon, alt);

	}



	public double distance3d(Point3D gps0, Point3D gps1) {


		double theDistance = (Math.sin(Math.toRadians(gps0.x())) *

				Math.sin(Math.toRadians(gps1.x()))) +

				(Math.cos(Math.toRadians(gps0.x())) * Math.cos(Math.toRadians(gps1.x())) *

				Math.cos(Math.toRadians(gps0.y() - gps1.y() )));



		return new Double((Math.toDegrees(Math.acos(theDistance))) * 69.09)* 1.60934;

	}
	


	public Point3D vector3D(Point3D gps0, Point3D gps1) {

	    double b = world + gps1.x();

	    double c = world + gps0.x();

	    double b2 = b * b;

	    double c2 = c * c;

	    double bc2 = 2 * b * c;

	    double dis = gps1.y() - gps0.y();

	    dis = dis * Math.PI / 180;

	    double cos = 1 - dis * dis / 2; 

	    double x = Math.sqrt(b2 + c2 - bc2 * cos);

	    dis = gps1.x() - gps0.x();

	    dis = dis * Math.PI / 180;

	    cos = 1 - dis * dis/2; 

	    double y = Math.sqrt(b2 + c2 - bc2 * cos);

	    double z = gps1.z() - gps0.z();

	    return new Point3D(x, y, z);

	}



	public  double[] azimuth_elevation_dist(Point3D gps0, Point3D gps1) {

		double [] ans = {0,0,0};

		ans[0] = gps0.north_angle(gps1);

		ans[1] = gps0.up_angle(gps1); 

		ans[2] =(distance3d(gps0, gps1));

		return ans;

	}


	public boolean isValid_GPS_Point(Point3D p) {

		if(p.x() >= -180 && p.x() <= 180 && p.y() >= -90 && p.y() <= 90 && p.z() >= -450) {

			return true;

		}

		return false;

	}

}

