package GIS;

import Geom.Geom_element;
import Geom.Point3D;

public class element implements GIS_element {
	private String MAC , SSID , AuthMode , FirstSeen , Channel , RSSI ,CurrentLatitude,AltitudeMeters, AccuracyMeters , Type;
	
	@Override
	public Geom_element getGeom() {//חסר
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meta_data getData() {//חסר
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void translate(Point3D vec) {//חסר
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
	

}
