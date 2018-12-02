package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 *  This class implements GIS_layer functions.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public class layer implements GIS_layer {
	private ArrayList<GIS_element> arr = new ArrayList<GIS_element>();
	private Meta_data mt; 
	/**
	 * add method adds gis_element
	 * @param args0 is gis_ element that we want to add.
	 * @return arr ArrayList<GIS_element> arr with the new gis_element.
	 */
	@Override
	public boolean add(GIS_element arg0) {
		return arr.add(arg0);
	}
	/**
	 * add method adds all collection of gis_element.
	 * @param args0 is collection of gis_element that we want to add to our layer.
	 * @return arr ArrayList<GIS_element> arr with the new collection of gis_element.
	 */
	@Override
	public boolean addAll(Collection<? extends GIS_element> arg0) {
		return arr.addAll(arg0);
	}
	/**
	 * clear method remove all the gis_element from our array.
	 */
	@Override
	public void clear() {
		arr.clear();
		System.out.println("done, the array clear");
	}
	/**
	 * contains method check if arg0 is in our array.
	 * @param args0 is object of gis_element that we want to check on our array.
	 * @return boolean if the object exist.
	 */
	@Override
	public boolean contains(Object arg0) {
		return arr.contains(arg0);
	}
	/**
	 * containsAll method check if we have similar collection in our array.
	 * @param args0 is object of gis_element that we want to check on our array.
	 * @return boolean if all the collection exist.
	 */
	@Override
	public boolean containsAll(Collection<?> arg0) {
		return arr.containsAll(arg0);
	}
	/**
	 * isEmpty method tell if our array is empty.
	 * @return boolean if he is empty.
	 */
	@Override
	public boolean isEmpty() {
		return arr.isEmpty();
	}
	/**
	 * @return an Iterator (of GIS_element) over this layer
	 */
	@Override
	public Iterator<GIS_element> iterator() {
		return arr.iterator();
	}
	/**
	 * remove method remove gis_element
	 * @param args0 is gis_ element that we want to remove from our array.
	 * @return arr ArrayList<GIS_element> arr without arg0.
	 */
	@Override
	public boolean remove(Object arg0) {
		return arr.remove(arg0);
	}
	/**
	 * removeAll method remove collection of gis_element
	 * @param args0 is collections of gis_ element that we want to remove from our array.
	 * @return arr ArrayList<GIS_element> arr without arg0(the collection of gis_element).
	 */
	@Override
	public boolean removeAll(Collection<?> arg0) {
		return arr.removeAll(arg0);
	}
	/**
	 * retainAll method retain collection of gis_element
	 * @param args0 is collections of gis_ element that we want to retain from our array.
	 * @return arr ArrayList<GIS_element>.
	 */
	@Override
	public boolean retainAll(Collection<?> arg0) {
		return arr.retainAll(arg0);
	}
	/**
	 * @return int of the layer size(return how many element the layer have).
	 */
	@Override
	public int size() {
		return arr.size();
	}
	/**
	 * @return Object[] of the layer(return all element inside the layer as a array).
	 */
	@Override
	public Object[] toArray() {
		Iterator<GIS_element>runner=arr.iterator();
		GIS_element[]arr=new element[size()];
		for(int i=0;i<size();i++) {
			if(runner.hasNext())
				arr[i]=runner.next();
		}
		return arr;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return mt the layer metadata.
	 */
	@Override
	public Meta_data get_Meta_data() {
		return mt;
	}
	/**
	 * write the layer as string
	 * @return string of all the elements in this layer.
	 */
	public String toString() {
		String s="";
		Iterator<GIS_element> runner=this.iterator();
		while(runner.hasNext()) {
			s+=runner.next().toString();
			s+="\n";
		}
		return s;
	}
}
