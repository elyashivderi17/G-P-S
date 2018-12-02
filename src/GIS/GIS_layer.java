package GIS;
import java.util.Set;
/**
 * This interface represents acarraylist of GIS elements.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public interface GIS_layer extends Set<GIS_element>{
	public Meta_data get_Meta_data(); 
	
}
