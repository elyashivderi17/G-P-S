package Coords;

import Coords.MyCoords;





import com.sun.javafx.geom.AreaOp.AddOp;



import Coords.MyCoords;

import Geom.Point3D;



public class test_main {



	public static void main(String[] args) {

		Point3D gps = new Point3D(32.33333,32.22222);

		Point3D local_vector_in_meter = new Point3D(5,5,5);



		Point3D meter= gps.GeoToMer();

		System.out.println(meter.toString());

		meter.add(local_vector_in_meter);

		System.out.println(meter.toString());

		Point3D outputGps = meter.MerToGeo();

		System.out.println(outputGps.toString());



	}



}