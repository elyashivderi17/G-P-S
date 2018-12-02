package Algorithms;

import java.util.Iterator;

import GIS.GIS_element;
import GIS.layer;
/**
 * This class represents copy func, delate func and switch places func.
 */

public class MultAlg {

	private layer l;
	private GIS_element g;
	/**
	 * This func removes this layer from our layer.
	 * @return if we delate the layer or not.
	 */
	public boolean remove(layer lay) {
		boolean ans=l.removeAll(lay);
		return ans;
	}
	/**
	 * This func copy this layer to our layer.
	 */
	public void copy(layer lay, GIS_element gis) {
		l=lay;
		g=gis;
	}
	/**
	 * This func switch places between GIS_element a to GIS_element b.
	 */
	public void switchplaces(GIS_element a,GIS_element b) {
		GIS_element tmp=a;
		GIS_element tmp2=b;
		Iterator<GIS_element>runner=l.iterator();
		while(runner.hasNext()) {
			GIS_element temp=runner.next();
			if(temp.equals(a))
				temp=b;
			else if(temp.equals(b))
				temp=a;
		}
	}
}
