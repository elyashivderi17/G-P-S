package GIS;

import java.util.Set;
/**
 * This interface represents acarraylist of GIS layers.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public interface GIS_project extends Set<GIS_layer>{
	public Meta_data get_Meta_data(); 
	
}
