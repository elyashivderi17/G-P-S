package Algorithms;

import java.util.Iterator;

import GIS.GIS_element;
import GIS.layer;
import Geom.Geom_element;
import Geom.Point3D;

public class SelectByRectangle {
	private layer l;
	private Point3D start;
	private Point3D end;
	public SelectByRectangle(layer lay,Point3D a,Point3D b) {
		l=lay;
		start=a;
		end=b;
	}
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
		for(int i = 0;i<8;i++) {
			distances[i] = g.distance3D(edges[i]);
			while(runner.hasNext()) {
				GIS_element gis=runner.next();
				Geom_element e=gis.getGeom();
				if(e.distance3D(edges[i])==0) return true;
			}
			runner=l.iterator();//לסיים לחשב אם המרחק את המרכז ולא רק קודקודים
		}
		
		return false;

	}
}
