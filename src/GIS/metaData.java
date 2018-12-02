package GIS;

import Geom.Point3D;
/**
 *  This class implements Meta_data functions.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
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
	/**
	 * @return long that represent the utc of our metadata.
	 */
	@Override
	public long getUTC() {
		return this.UTC;
	}
	/**
	 * @return Point3D that represent the Point3D of our metadata.
	 */
	@Override
	public Point3D get_Orientation() {
		return this.a;
	}
	//getters and setters
	public void setUTC(long uTC) {
		UTC = uTC;
	}

	public Point3D getA() {
		return this.a;
	}

	public void setA(Point3D a) {
		this.a = a;
	}
	/**
	 * write the metadata as string
	 * @return string of our metadata.
	 */
	public String toString() {
		return UTC+","+a.toString();
	}
}
