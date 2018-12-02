package Geom;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * This class represents a path- arraylist of 3D point in space.
 */
public class Path implements Geom_element{
	private ArrayList<Point3D> arr=new ArrayList<Point3D>();
	public Path(ArrayList<Point3D> a) {//constractor
		this.setArr(a);
	}
	public Path(Point3D a) {//constractor
		arr.add(a);
	}
	public Path(double x,double y,double z) {//constractor
		arr.add(new Point3D(x,y,z));
	}
//getters and setters
	public ArrayList<Point3D> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Point3D> arr) {
		this.arr = arr;
	}
	/** 
	 * return the distance3d between the point3d p to the closest point3d in the array as double.
	 * */
	@Override
	public double distance3D(Point3D p) {
		if(arr.isEmpty()) return -1;
		Iterator<Point3D>runner=arr.iterator();
		double min=Double.MAX_VALUE;
		double tmp=0;
		while(runner.hasNext()) {
			tmp=runner.next().distance3D(p);
			if(tmp<min);
			min=tmp;
		}
		return min;
	}
	/** 
	 * return the distance2d between the point3d p to the closest point3d in the array as double.
	 * */
	@Override
	public double distance2D(Point3D p) {
		if(arr.isEmpty()) return -1;
		Iterator<Point3D>runner=arr.iterator();
		double min=Double.MAX_VALUE;
		double tmp=0;
		while(runner.hasNext()) {
			tmp=runner.next().distance2D(p);
			if(tmp<min);
			min=tmp;
		}
		return min;
	}
}
