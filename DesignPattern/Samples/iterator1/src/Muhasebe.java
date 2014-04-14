public class Muhasebe implements MyIterable{
private Object personel[];
	
	public Muhasebe(){
		
		personel=new Personel[3];
		personel[0]=new Personel("Ali", "Serce");
		personel[1]=new Personel("Kaan","Aslan");
		personel[2]=new Personel("Metin","Kaya");
	}
	
	public MyIterator iterator(){
		return new ArrayIterator(personel);
	}
}
