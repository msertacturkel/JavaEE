import java.util.Iterator;

public class Muhasebe implements Iterable<Personel>{
private Personel personel[];
	
	public Muhasebe(){
		
		personel=new Personel[3];
		personel[0]=new Personel("Ali", "Serce");
		personel[1]=new Personel("Kaan","Aslan");
		personel[2]=new Personel("Metin","Kaya");
	}
	
	public Iterator<Personel> iterator(){
		return new ArrayIterator<Personel>(personel);
	}
}
