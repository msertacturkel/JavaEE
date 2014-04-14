import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator<E> implements Iterator<E> {
	private ArrayList<E> obj;
	private int index = 0;

	public ArrayListIterator(ArrayList<E> obj) {
		this.obj = obj;
	}

	public E next() {
		E per = obj.get(index);
		index++;
		return per;
	}

	public boolean hasNext() {

		if (index < obj.size())
			return true;
		return false;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
