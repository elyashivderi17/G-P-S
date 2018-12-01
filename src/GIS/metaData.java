package GIS;

import Geom.Point3D;

public class metaData implements Meta_data{
	private long UTC;
	private Point3D a;
	public metaData() {
		this.a=null;
		this.UTC=0;
	}
	public metaData(long utc,Point3D p) {
		this.UTC=utc;
		this.a=p;
	}
	public metaData(Meta_data ot) {
		this.a=ot.get_Orientation();
		this.UTC=ot.getUTC();
	}
	@Override
	public long getUTC() {
		return this.UTC;
	}

	@Override
	public Point3D get_Orientation() {
		return this.a;
	}
	public void setUTC(long uTC) {
		UTC = uTC;
	}

	public Point3D getA() {
		return this.a;
	}

	public void setA(Point3D a) {
		this.a = a;
	}
	public String toString() {
		return UTC+","+a.toString();
	}
}
