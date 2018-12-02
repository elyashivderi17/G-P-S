package Geom;
/**
 * This class represents Circle.
 * https://en.wikipedia.org/wiki/Circle
 */
public class Circle implements Geom_element {
	private Point3D cen;
	private double radius;
	public Circle(Point3D cen, double rad) {//constractor
		this.set_cen(cen);
		this.set_radius(rad);
	}
	public Circle(double x,double y,double z,double rad) {//constractor
		Point3D p=new Point3D(x,y,z);
		this.set_cen(p);
		this.set_radius(rad);
	}
	public Circle(double x,double y,double rad) {//constractor
		Point3D p=new Point3D(x,y);
		this.set_cen(p);
		this.set_radius(rad);
	}
	/** 
	 * return the distance3d between two points3d as double.
	 * */
	@Override
	public double distance3D(Point3D p) {
		double dist=cen.distance3D(p);
		dist-=radius;
		if(dist<0)return 0;
		return dist;
	}
	/** 
	 * return the distance2d between two points3d as double.
	 * */
	@Override
	public double distance2D(Point3D p) {
		double dist=cen.distance2D(p);
		dist-=radius;
		if(dist<0)return 0;
		return dist;
	}
//setters and getters
	public Point3D get_cen() {
		return cen;
	}

	public void set_cen(Point3D cen) {
		this.cen = cen;
	}

	public double get_radius() {
		return radius;
	}

	public void set_radius(double radius) {
		this.radius = radius;
	}
	
}
