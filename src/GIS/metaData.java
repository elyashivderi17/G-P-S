package GIS;

import Geom.Point3D;

public class metaData implements Meta_data{
private long UTC;
private Point3D a;
	@Override
	public long getUTC() {
		// TODO Auto-generated method stub
		return this.UTC;
	}

	@Override
	public Point3D get_Orientation() {
		// TODO Auto-generated method stub
		return this.a;
	}
	public metaData() {
		this.a=null;
		this.UTC=0;
	}
	public metaData(long UTC,Point3D b) {
		this.a=b;
		this.UTC=UTC;
	}
	public metaData(Meta_data ot) {
		this.a=ot.get_Orientation();
		this.UTC=ot.getUTC();
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

}
