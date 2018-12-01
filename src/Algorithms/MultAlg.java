package Algorithms;

import java.util.Iterator;

import GIS.GIS_element;
import GIS.layer;


public class MultAlg {

	private layer l;
	private GIS_element g;
	public boolean remove(layer lay) {
		boolean ans=l.removeAll(lay);
		return ans;
	}
	public void copy(layer lay, GIS_element gis) {
		l=lay;
		g=gis;
	}
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
