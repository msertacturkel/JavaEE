public class ArrayIterator implements MyIterator {

	private Object[] obj;
	private int index = 0;

	public ArrayIterator(Object[] obj) {
		this.obj = obj;
	}

	public Object next() {
		Object ob = obj[index];
		index++;
		return ob;
	}

	public boolean hasNext() {
		if (index < obj.length && obj[index] != null)
			return true;
		return false;
	}
}
