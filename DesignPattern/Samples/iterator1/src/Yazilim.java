import java.util.ArrayList;
public class Yazilim implements MyIterable{

	private ArrayList<Object> personel;
	
	public Yazilim(){
		personel=new ArrayList();
		personel.add(new Personel("Ali1", "Serce1"));
		personel.add(new Personel("Kaan1","Aslan1"));
		personel.add(new Personel("Metin1","Kaya1"));
	}
	
	
	public MyIterator iterator(){
		return new ArrayListIterator(personel);
	}	
}
