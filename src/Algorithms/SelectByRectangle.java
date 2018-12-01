package Algorithms;

import java.util.Iterator;

import GIS.GIS_element;
import GIS.element;
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
			Geom_element g;
			g=runner.next().getGeom();//להשלים
		}
		return lay;
	}
}
