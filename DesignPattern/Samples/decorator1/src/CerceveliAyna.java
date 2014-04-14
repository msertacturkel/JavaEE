
public class CerceveliAyna extends AynaDecorator {

	@Override
	public void produce() {		
		getAyna().produce();
		cerceveEkle();
	}
	//yeni yetenek
	public void cerceveEkle(){
		System.out.println("cerceve eklendi..");
	}
}
