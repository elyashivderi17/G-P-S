package GIS;

import Coords.MyCoords;
import Geom.Geom_element;
import Geom.Point3D;
/**
 *  This class implements GIS_element functions.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public class element implements GIS_element {
	private String MAC , SSID , AuthMode , FirstSeen , Channel , RSSI ,CurrentLatitude,CurrentLongitude ,AltitudeMeters, AccuracyMeters , Type;
	private Point3D p;
	private Meta_data data;
	
	public element(String MAC ,String SSID ,String AuthMode ,String FirstSeen ,String Channel ,String RSSI ,String CurrentLatitude,String CurrentLongitude,String AltitudeMeters,String AccuracyMeters ,String Type) {//constractor
		setMAC(MAC);
		setSSID(SSID);
		setAuthMode(AuthMode);
		setFirstSeen(FirstSeen);
		setChannel(Channel);
		setRSSI(RSSI);
		setAccuracyMeters(AccuracyMeters);
		setType(Type);
		setCurrentLatitude(CurrentLatitude);
		setCurrentLongitude(CurrentLongitude);
		setAltitudeMeters(AltitudeMeters);
		setgeom(CurrentLatitude,CurrentLongitude,AltitudeMeters);
		data=new metaData();;
	}
	public element(Point3D p,metaData m,String MAC ,String SSID ,String AuthMode ,String FirstSeen ,String Channel ,String RSSI ,String AccuracyMeters ,String Type) {//constractor
		setMAC(MAC);
		setSSID(SSID);
		setAuthMode(AuthMode);
		setFirstSeen(FirstSeen);
		setChannel(Channel);
		setRSSI(RSSI);
		setAccuracyMeters(AccuracyMeters);
		setType(Type);
		setCurrentLatitude(CurrentLatitude);
		setCurrentLongitude(CurrentLongitude);
		setAltitudeMeters(AltitudeMeters);
		setgeom(p);
		data=new metaData(m);;
	}
	 /**
     * getgeom return our geom element
     * @return p that represent the point3d of our element  
     */
	@Override
	public Geom_element getGeom() {
		return p;
	}
	/**
     * getData return our metadata
     * @return data that represent the metadata of our element  
     */
	@Override
	public Meta_data getData() {
		return data;
	}
	 /**
     * tranlase method is to change given Point3D
     * @param vec is the translated element.
     */
	@Override
	public void translate(Point3D vec) {
		MyCoords m=new MyCoords();
		Point3D p=m.add(this.p,vec );
		this.p=new Point3D(p);
	}
	//getters and setters
	public void setgeom(String currentLatitude2, String currentLongitude2, String altitudeMeters2) {//set geom
		p=new Point3D(Double.parseDouble(CurrentLatitude),Double.parseDouble(CurrentLongitude),Double.parseDouble(AltitudeMeters));

	}
	public void setgeom(Point3D p2) {//set geom
		p=new Point3D(p2);
	}

	public String getCurrentLatitude() {
		return CurrentLatitude;
	}

	public void setCurrentLatitude(String currentLatitude) {
		CurrentLatitude = currentLatitude;
	}

	public String getRSSI() {
		return RSSI;
	}

	public void setRSSI(String rSSI) {
		RSSI = rSSI;
	}

	public String getAuthMode() {
		return AuthMode;
	}

	public void setAuthMode(String authMode) {
		AuthMode = authMode;
	}

	public String getAccuracyMeters() {
		return AccuracyMeters;
	}

	public void setAccuracyMeters(String accuracyMeters) {
		AccuracyMeters = accuracyMeters;
	}

	public String getAltitudeMeters() {
		return AltitudeMeters;
	}

	public void setAltitudeMeters(String altitudeMeters) {
		AltitudeMeters = altitudeMeters;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

	public String getFirstSeen() {
		return FirstSeen;
	}

	public void setFirstSeen(String firstSeen) {
		FirstSeen = firstSeen;
	}

	public String getSSID() {
		return SSID;
	}

	public void setSSID(String sSID) {
		SSID = sSID;
	}

	public String getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}
	public String getCurrentLongitude() {
		return CurrentLongitude;
	}
	public void setCurrentLongitude(String currentLongitude) {
		CurrentLongitude = currentLongitude;
	}
	public void setData(Meta_data data) {
		this.data = data;
	}
	/**
	 * write the element as string
	 * @return string of all the element
	 */
	public String toString() {
		String s=MAC+","+ SSID+","+AuthMode+","+FirstSeen+","+Channel+","+RSSI+","+CurrentLatitude+","+CurrentLongitude+","+AltitudeMeters+","+AccuracyMeters+","+Type;
		return s;
	}

}
