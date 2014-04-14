import java.util.ArrayList;
import java.util.Iterator;
public class Yazilim implements Iterable<Personel>{

	private ArrayList<Personel> pers;
	
	public Yazilim(){
		pers=new ArrayList<Personel>();
		pers.add(new Personel("Ali1", "Serce1"));
		pers.add(new Personel("Kaan1","Aslan1"));
		pers.add(new Personel("Metin1","Kaya1"));
	}
	
	
	public Iterator<Personel> iterator(){
		return new ArrayListIterator(pers);
	}	
}
