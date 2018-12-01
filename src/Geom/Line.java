package Geom;

public class Line implements Geom_element {
	private Point3D start;
	private Point3D end;

	public Line(Point3D start,Point3D end) {
		this.start=start;
		this.end=end;
	}

	public Line(double xstart,double ystart,double zstart,double xend,double yend,double zend) {
		this.start=new Point3D(xstart,ystart,zstart);
		this.end=new Point3D(xend,yend,zend);
	}

	@Override
	public double distance3D(Point3D p) {
		return dist3d(new Line(start,end),p);
	}

	@Override
	public double distance2D(Point3D p) {
		return dist2d(new Line(start,end),p);
	}
	// given a line based on two points, and a point away from the line,
    // find the perpendicular distance from the point to the line.
    // see http://mathworld.wolfram.com/Point-LineDistance2-Dimensional.html
    // for explanation and defination.
	private static double dist2d(Line a,Point3D p){
		 Point3D l1 = a.start;
         Point3D l2 = a.end;
         return Math.abs((l2.x() - l1.x())*(l1.y() - p.y()) - (l1.x() - p.x())*(l2.y() - l1.y()))/
                 Math.sqrt(Math.pow(l2.x() - l1.x(), 2) + Math.pow(l2.y() - l1.y(), 2));
	}
	// given a line based on two points3d, and a point3d away from the line,
    // find the perpendicular distance from the point to the line.
    // see http://mathworld.wolfram.com/Point-LineDistance3-Dimensional.html
    // for explanation and defination.
	private static double dist3d(Line a,Point3D p) {
	        double[] PointThing = new double[3];
	        double[] TotalThing = new double[3];
	        PointThing[0] = a.start.x() - p.x();
	        PointThing[1] = a.start.y() - p.y();
	        PointThing[2] = a.start.z() - p.z();

	        TotalThing[0] = (PointThing[1]*a.end.z() - PointThing[2]*a.end.y());
	        TotalThing[1] = -(PointThing[0]*a.end.z() - PointThing[2]*a.end.x());
	        TotalThing[2] = (PointThing[0]*a.end.y() - PointThing[1]*a.end.x());

	    double distance = (double) (Math.sqrt(TotalThing[0]*TotalThing[0] + TotalThing[1]*TotalThing[1] + TotalThing[2]*TotalThing[2]) /
	                    Math.sqrt(a.end.x() * a.end.x() + a.end.y() * a.end.y() + a.end.z() * a.end.z() ));
	    return distance;
	}
	public Point3D getStart() {
		return start;
	}

	public void setStart(Point3D start) {
		this.start = start;
	}

	public Point3D getEnd() {
		return end;
	}

	public void setEnd(Point3D end) {
		this.end = end;
	}
}
