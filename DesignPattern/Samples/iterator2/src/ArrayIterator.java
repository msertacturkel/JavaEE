import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

	private E[] obj;
	private int index = 0;

	public ArrayIterator(E[] obj) {
		this.obj = obj;
	}

	public E next() {
		E ob = obj[index];
		index++;
		return ob;
	}

	public boolean hasNext() {
		if (index < obj.length && obj[index] != null)
			return true;
		return false;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
