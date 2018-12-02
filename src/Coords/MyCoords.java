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

		double lonNorm=Math.cos(gps.x()*(Math.PI/180));

		if(!isValid_GPS_Point(gps)) 

			return null;
		

		double meterTolat =Math.asin(local_vector_in_meter.x()/world)*(180/Math.PI);

		double meterTolong=Math.asin(local_vector_in_meter.y()/world*lonNorm)*(180/Math.PI);

		double x=meterTolat+gps.x();

		double y=meterTolong+gps.y();

		double z=gps.z()+local_vector_in_meter.z();

		if((y>90)||(y<-90)) { 

			System.out.println("Invalid x");

			return null;

		}

		if(x>180) {

			x=((x+180)%360)-180;

		}

		 if(x<-180) {

			x=(y+180)+180;

		}

		Point3D negps = new Point3D (x,y,z);

		if(isValid_GPS_Point(negps))

			return negps;

		return null;

		}


	public double distance3d(Point3D gps0, Point3D gps1) {

		double LonNorm=Math.cos(gps0.x()*Math.PI/180);

		double diff = gps1.x()-gps0.x();

		double radian = (diff*Math.PI)/180;

		double tometer1 = Math.sin(radian)*world;

		double diff2 = gps1.y()-gps0.y();

		double radian2 = (diff2*Math.PI)/180;

		double tometer2 = Math.sin(radian2)*world*LonNorm;



		return Math.sqrt((tometer1*tometer1) + (tometer2*tometer2));

	}


	public Point3D vector3D(Point3D gps0, Point3D gps1) {

		double LonNorm=Math.cos(gps0.x()*Math.PI/180);

		double diff = gps1.x()-gps0.x();

		double radian = (diff*Math.PI)/180;

		double tometer1 = Math.sin(radian)*world;

		double diff2 = gps1.y()-gps0.y();

		double radian2 = (diff2*Math.PI)/180;

		double tometer2 = Math.sin(radian2)*world*LonNorm;

		double diff3 = gps1.z()-gps0.z();



		Point3D vector3d=new Point3D (tometer1 , tometer2, diff3);



		return vector3d;

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

