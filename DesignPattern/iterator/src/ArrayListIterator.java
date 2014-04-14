import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator implements Iterator<Personel> {

	private int index = 0;
	private ArrayList<Personel> personel;

	public ArrayListIterator(ArrayList personel) {
		this.personel = personel;
	}

	@Override
	public boolean hasNext() {
		if (index < personel.size())
			return true;
		return false;

	}

	@Override
	public Personel next() {
		Personel per = personel.get(index);
		index++;
		return per;

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
