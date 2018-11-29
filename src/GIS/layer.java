package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class layer implements GIS_layer {
	ArrayList<GIS_element> arr = new ArrayList<GIS_element>();
	@Override
	public boolean add(GIS_element arg0) {
		return arr.add(arg0);
	}

	@Override
	public boolean addAll(Collection<? extends GIS_element> arg0) {
		// TODO Auto-generated method stub
		return arr.addAll(arg0);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		arr.clear();
		System.out.println("done, the array clear");
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return arr.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return arr.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return arr.isEmpty();
	}

	@Override
	public Iterator<GIS_element> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return arr.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return arr.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return arr.retainAll(arg0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return arr.size();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meta_data get_Meta_data() {
		// TODO Auto-generated method stub
		return null;
	}

}
