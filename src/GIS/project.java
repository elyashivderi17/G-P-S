package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class project implements GIS_project{
	private ArrayList<GIS_layer> arr = new ArrayList<GIS_layer>();
	private Meta_data mt; 
	public project() {
		this.arr=new ArrayList<GIS_layer>();
	}
	@Override
	public boolean add(GIS_layer e) {
		return arr.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {
		return arr.addAll(c);
	}

	@Override
	public void clear() {
		arr.clear();
		System.out.println("done, the array clear");
	}

	@Override
	public boolean contains(Object o) {
		return arr.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return arr.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return arr.isEmpty();
	}

	@Override
	public Iterator<GIS_layer> iterator() {
		return arr.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return arr.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return arr.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return arr.retainAll(c);
	}

	@Override
	public int size() {
		return arr.size();
	}

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
		return null;//חסר
	}

	@Override
	public Meta_data get_Meta_data() {
		return mt;
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
