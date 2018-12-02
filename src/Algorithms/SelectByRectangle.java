package Algorithms;

import java.util.Iterator;

import GIS.GIS_element;
import GIS.layer;
import Geom.Geom_element;
import Geom.Point3D;

public class SelectByRectangle {
	/**
	 * This class get layer and square and return new layer with the GIS_element in this square.
	 * @author Bar Genish
	 * @author Elyashiv Deri
	 */
	private layer l;
	private Point3D start;
	private Point3D end;
	public SelectByRectangle(layer lay,Point3D a,Point3D b) {//constractor
		l=lay;
		start=a;
		end=b;
	}
	/**
	 * This func returns new layer with the GIS_element between our 2 point3d.
	 * @return new layer with the GIS_element between our 2 point3d.
	 */
	public layer calrect() {
		layer lay=new layer();
		Iterator<GIS_element>runner=l.iterator();
		while(runner.hasNext()) {
			GIS_element gis=runner.next();
			Geom_element g=gis.getGeom();
			if(contains(g)==true) lay.add(gis);
		}
		return lay;
	}
	/**
	 * help fun that return if the GIS_element is in the square or not.
	 * @return if the GIS_element in the square or not.
	 * @param g the Geom_element that we have to check.
	 */
	private Boolean contains(Geom_element g) {
		Point3D[] edges = new Point3D[7];
		edges[0] = start;
		edges[1] = new Point3D(start.x(),start.y(),end.z());
		edges[2]=new Point3D(start.x(),end.y(),end.z());
		edges[3]=new Point3D(start.x(),end.y(),start.z());
		edges[4]=new Point3D(end);
		edges[5]=new Point3D(end.x(),start.y(),start.z());
		edges[6]=new Point3D(end.x(),start.y(),end.z());
		edges[7]=new Point3D(end.x(),end.y(),start.z());

		Double[] distances = new Double[7];
		Iterator<GIS_element>runner=l.iterator();
		double xmid=(start.x()+end.x())/2;
		double ymid=(start.y()+end.y())/2;
		double zmid=(start.z()+end.z())/2;
		Point3D mid=new Point3D(xmid,ymid,zmid);
		for(int i = 0;i<8;i++) {
			distances[i] = g.distance3D(edges[i]);
			while(runner.hasNext()) {
				GIS_element gis=runner.next();
				Geom_element e=gis.getGeom();
				if(e.distance3D(edges[i])==0) return true;
				if(e.distance3D(mid)<=mid.distance3D(start)) return true;
			}
			runner=l.iterator();
		}
		return false;
	}
}
