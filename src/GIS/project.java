package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class project implements GIS_project{
	ArrayList<GIS_layer> arr = new ArrayList<GIS_layer>();
	public project() {
		this.arr=new ArrayList<GIS_layer>();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean add(GIS_layer e) {
		// TODO Auto-generated method stub
		return arr.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {
		// TODO Auto-generated method stub
		return arr.addAll(c);
	}

	@Override
	public void clear() {
		arr.clear();
		// TODO Auto-generated method stub
		System.out.println("done, the array clear");
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return arr.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return arr.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return arr.isEmpty();
	}

	@Override
	public Iterator<GIS_layer> iterator() {
		// TODO Auto-generated method stub
		return arr.iterator();
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return arr.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return arr.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return arr.retainAll(c);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return arr.size();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;//חסר
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;//חסר
	}

	@Override
	public Meta_data get_Meta_data() {
		// TODO Auto-generated method stub
		return null;//חסר
	}
	public String toString() {
		String s="";
		Iterator<GIS_layer> runner=this.iterator();
		while(runner.hasNext()) {
			s+=runner.next().toString();
		}
		return s;
	}
}
