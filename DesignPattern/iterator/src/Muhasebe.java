import java.util.Iterator;

public class Muhasebe implements Iterable<Object> {
	private Object personel[];

	public Muhasebe() {

		personel = new Object[3];
		personel[0] = new Personel("Ali", "Serce");
		personel[1] = new Personel("Kaan", "Aslan");
		personel[2] = new Personel("Metin", "Kaya");
	}

	public Iterator iterator() {
		return new ArrayIterator(personel);
	}
}
