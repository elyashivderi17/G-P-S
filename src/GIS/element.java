package GIS;

import Geom.Geom_element;
import Geom.Point3D;

public class element implements GIS_element {
	private String MAC , SSID , AuthMode , FirstSeen , Channel , RSSI ,CurrentLatitude,CurrentLongitude ,AltitudeMeters, AccuracyMeters , Type;
	private Point3D geom;
	private Meta_data data;
	public element(String MAC ,String SSID ,String AuthMode ,String FirstSeen ,String Channel ,String RSSI ,String CurrentLatitude,String CurrentLongitude,String AltitudeMeters,String AccuracyMeters ,String Type) {
		setMAC(MAC);
		setSSID(SSID);
		setAuthMode(AuthMode);
		setFirstSeen(FirstSeen);
		setChannel(Channel);
		setRSSI(RSSI);
		setCurrentLatitude(CurrentLatitude);
		setCurrentLongitude(CurrentLongitude);
		setAltitudeMeters(AltitudeMeters);
		setAccuracyMeters(AccuracyMeters);
		setType(Type);
	}
	public element() {//îä ìòùåú ôä òí geom åmetadata?
		this.MAC=null;
		this.SSID=null;
		this.AuthMode=null;
		this.FirstSeen=null;
		this.Channel=null;
		this.RSSI=null;
		this.CurrentLatitude=null;
		this.CurrentLongitude=null;
		this.AltitudeMeters=null;
		this.AccuracyMeters=null;
		this.Type=null;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Geom_element getGeom() {
		// TODO Auto-generated method stub
		return geom;
	}

	@Override
	public Meta_data getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public void translate(Point3D vec) {//çñø
		// TODO Auto-generated method stub
		
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
	public void setGeom(Point3D geom) {
		this.geom = geom;
	}
	public void setData(Meta_data data) {
		this.data = data;
	}
	public String toString() {
		String s=MAC+","+ SSID+","+AuthMode+","+FirstSeen+","+Channel+","+RSSI+","+CurrentLatitude+","+CurrentLongitude+","+AltitudeMeters+","+AccuracyMeters+","+Type+". ";
		System.out.println(s);
		return s;
	}

}
