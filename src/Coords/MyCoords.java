package Coords;


import Geom.Point3D;

import java.util.Hashtable;

import java.util.Map;



import com.sun.javafx.geom.AreaOp.AddOp;

import com.sun.javafx.scene.paint.GradientUtils.Point;



public class MyCoords implements coords_converter {

	

	final static int earth_rad = 6371000;



	@Override

	public Point3D add(Point3D gps, Point3D local_vector_in_meter) {

		double comp = local_vector_in_meter.x() / earth_rad;

		double lat = gps.x() + (comp * 180/Math.PI);

		double comp2 = (local_vector_in_meter.y() + (comp * 180 / Math.PI));

		double lon = gps.y() + (comp2 * 180 / Math.PI);

		double alt = gps.z() + local_vector_in_meter.z();

		return new Point3D(lat, lon, alt);

	}


	@Override

	public double distance3d(Point3D gps0, Point3D gps1) {


		double theDistance = (Math.sin(Math.toRadians(gps0.x())) *

				Math.sin(Math.toRadians(gps1.x()))) +

				(Math.cos(Math.toRadians(gps0.x())) * Math.cos(Math.toRadians(gps1.x())) *

				Math.cos(Math.toRadians(gps0.y() - gps1.y() )));



		return new Double((Math.toDegrees(Math.acos(theDistance))) * 69.09)* 1.60934;

	}
	


	@Override
	public Point3D vector3D(Point3D gps0, Point3D gps1) {


	    double b = earth_rad + gps1.x();

	    double c = earth_rad + gps0.x();



	    double b2 = b * b;

	    double c2 = c * c;

	    double bc2 = 2 * b * c;



	    // Longitudinal calculations.

	    double alpha = gps1.y() - gps0.y();

	    // Conversion to radian.

	    alpha = alpha * Math.PI / 180;

	    // Small-angle approximation.

	    double cos = 1 - alpha * alpha / 2; //Math.cos(alpha);

	    // Use the law of cosines / Al Kashi theorem.

	    double x = Math.sqrt(b2 + c2 - bc2 * cos);



	    // Repeat for latitudinal calculations

	    alpha = gps1.x() - gps0.x();

	    alpha = alpha * Math.PI / 180;

	    cos = 1 - alpha * alpha/2; //Math.cos(alpha);

	    double y = Math.sqrt(b2 + c2 - bc2 * cos);



	    // Obtain vertical difference, too

	    double z = gps1.z() - gps0.z();



	    return new Point3D(x, y, z);

	}



	/** computes the polar representation of the 3D vector be gps0-->gps1 

	 * Note: this method should return an azimuth (aka yaw), elevation (pitch), and distance*/
	@Override
	public  double[] azimuth_elevation_dist(Point3D gps0, Point3D gps1) {

		double [] ans = {0,0,0};

		ans[0] = gps0.north_angle(gps1);

		ans[1] = gps0.up_angle(gps1); 

		ans[2] =(distance3d(gps0, gps1));

		return ans;

	}

	/**

	 * return true if this point is a valid lat, lon , lat coordinate: [-180,+180],[-90,+90],[-450, +inf]

	 * @param p

	 * @return

	 */
	@Override
	public boolean isValid_GPS_Point(Point3D p) {

		if(p.x() >= -180 && p.x() <= 180 && p.y() >= -90 && p.y() <= 90 && p.z() >= -450) {

			return true;

		}

		return false;

	}

}

