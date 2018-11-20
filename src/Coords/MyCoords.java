package Coords;





import Geom.Point3D;

import java.util.Hashtable;

import java.util.Map;



import com.sun.javafx.geom.AreaOp.AddOp;

import com.sun.javafx.scene.paint.GradientUtils.Point;



public class MyCoords {/**



		/** computes a new point which is the gps point transformed by a 3D vector (in meters)*/

	public static Point3D adddd(Point3D gps, Point3D local_vector_in_meter) {



		Point3D meter= gps.GeoToMer();

				System.out.println(meter.toString());

		meter.add(local_vector_in_meter);

				System.out.println(meter.toString());

		Point3D outputGps = meter.MerToGeo();

				System.out.println(outputGps.toString());



		return outputGps;



	}







	public double distance3d(Point3D gps0, Point3D gps1) {

		Point3D p0 = gps0.GpsToMeter();

		Point3D p1 = gps1.GpsToMeter();



		return p0.distance3D(p1);





	}

	/** computes the 3D vector (in meters) between two gps like points */

	public Point3D vector3D(Point3D gps0, Point3D gps1) {



		Point3D vector = new Point3D(gps1.GpsToMeter().x()-gps0.GpsToMeter().x(),

				gps1.GeoToMer().y()-gps0.GeoToMer().y(), gps1.GeoToMer().z()-gps0.GeoToMer().z());

		return vector;

	}

	/** computes the polar representation of the 3D vector be gps0-->gps1 

	 * Note: this method should return an azimuth (aka yaw), elevation (pitch), and distance*/

	public  double[] azimuth_elevation_dist(Point3D gps0, Point3D gps1) {



		double [] ans = {0,0,0};

		ans[0] = gps0.north_angle(gps1);

		ans[1] = gps0.up_angle(gps1); 

		ans[2] =(distance3d(gps0, gps1));

		return ans;



	}

	/**

	 * return true iff this point is a valid lat, lon , lat coordinate: [-180,+180],[-90,+90],[-450, +inf]

	 * @param p

	 * @return

	 */

	public static boolean isValid_GPS_Point(Point3D p) {

		return(((Math.abs(p.y())<180)||(Math.abs(p.x()))<90) ||(p.z()<-450));

	}

}

