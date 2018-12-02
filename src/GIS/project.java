package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 *  This class implements GIS_project functions.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public class project implements GIS_project{
	private ArrayList<GIS_layer> arr = new ArrayList<GIS_layer>();
	private Meta_data mt; 
	public project() {//defult constracror
		this.arr=new ArrayList<GIS_layer>();
	}
	/**
     * add method adds gis_layer
     * @param e is gis_ layer that we want to add.
     * @return arr ArrayList<GIS_layer> arr with the new gis_layer.
     */
	@Override
	public boolean add(GIS_layer e) {
		return arr.add(e);
	}
	/**
     * add method adds collection of gis_layer
     * @param c is collection of gis_ layer that we want to add.
     * @return arr ArrayList<GIS_layer> arr with the new collection of gis_layer.
     */
	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {
		return arr.addAll(c);
	}
	/**
     * clear method remove all the gis_layer from our array.
     */
	@Override
	public void clear() {
		arr.clear();
		System.out.println("done, the array clear");
	}
	/**
     * contains method check if o is in our array.
     * @param o is object of that we want to check on our array.
     * @return boolean if the object exist.
     */
	@Override
	public boolean contains(Object o) {
		return arr.contains(o);
	}
	/**
     * containsAll method check if we have similar collection in our array.
     * @param c is collection of gis_layer that we want to check on our array.
     * @return boolean if all the collection exist.
     */
	@Override
	public boolean containsAll(Collection<?> c) {
		return arr.containsAll(c);
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
	 * @return an Iterator (of GIS_layer) over this layer
	 */
	@Override
	public Iterator<GIS_layer> iterator() {
		return arr.iterator();
	}
	/**
     * remove method remove object o
     * @param o is object of gis_ layer that we want to remove from our array.
     * @return arr ArrayList<GIS_layer> arr without o.
     */
	@Override
	public boolean remove(Object o) {
		return arr.remove(o);
	}
	/**
     * remove method removeAll Collection c
     * @param c is collection of gis_ layer that we want to remove from our array.
     * @return arr ArrayList<GIS_layer> arr without o(the collection of gis_layer).
     */
	@Override
	public boolean removeAll(Collection<?> c) {
		return arr.removeAll(c);
	}
	/**
     * retainAll method retain collection of gis_layer
     * @param c is collections of gis_layer that we want to retain from our array.
     * @return arr ArrayList<GIS_element>.
     */
	@Override
	public boolean retainAll(Collection<?> c) {
		return arr.retainAll(c);
	}
	/**
	 * @return int of the project size(return how many layer the project have).
	 */
	@Override
	public int size() {
		return arr.size();
	}
	/**
	 * @return Object[] of the project(return all layers inside the project as a array).
	 */
	@Override
	public Object[] toArray() {
		Iterator<GIS_layer>runner=arr.iterator();
		GIS_layer[]arr=new layer[size()];
		for(int i=0;i<size();i++) {
			if(runner.hasNext())
				arr[i]=runner.next();
		}
		return arr;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return mt the project metadata.
	 */
	@Override
	public Meta_data get_Meta_data() {
		return mt;
	}
	/**
	 * write the project as string
	 * @return string of all the layers in this project.
	 */
	public String toString() {
		String s="";
		Iterator<GIS_layer> runner=this.iterator();
		while(runner.hasNext()) {
			s+=runner.next().toString();
		}
		return s;
	}
}
