import java.util.ArrayList;

public class ArrayListIterator implements MyIterator {
	private ArrayList<Object> obj;
	private int index = 0;

	public ArrayListIterator(ArrayList<Object> obj) {
		this.obj = obj;
	}

	public Object next() {
		Object per = obj.get(index);
		index++;
		return per;
	}

	public boolean hasNext() {

		if (index < obj.size())
			return true;
		return false;
	}
}
