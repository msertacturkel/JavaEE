import java.util.ArrayList;
import java.util.Iterator;

public class Yazilim implements Iterable<Personel> {
	private ArrayList personel;

	public Yazilim() {
		personel = new ArrayList<Personel>();
		personel.add(new Personel("Ali", "Serce"));
		personel.add(new Personel("Kaan", "Aslan"));
		personel.add(new Personel("Metin", "Kaya"));
	}

	public Iterator<Personel> iterator() {
		return new ArrayListIterator(personel);
	}
}
