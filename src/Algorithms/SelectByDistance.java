package Algorithms;

import java.util.Iterator;

import GIS.GIS_element;
import GIS.layer;
import Geom.Geom_element;
import Geom.Point3D;
/**
 * This class get layer Point3D and distance as double and return new layer with the GIS_element in this distances from the point3D.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public class SelectByDistance {
	private layer l;
	private Point3D p;
	private double dist;
	public SelectByDistance(layer lay,Point3D p,double dist) {//constractor
		l=lay;
		this.p=p;
		this.dist=dist;
	}
	/**
	 * This func return new layer with the GIS_element in this distances from the point3D.
	 * @return new layer with the GIS_element int this distance from the Point3D.
	 */
	public layer CalByDist() {
		layer lay=new layer();
		Iterator<GIS_element>runner=l.iterator();
		while(runner.hasNext()) {
			GIS_element gis=runner.next();
			Geom_element g=gis.getGeom();
			if(g.distance3D(p)<=dist)
				lay.add(gis);
		}
		return l;
	}
}
