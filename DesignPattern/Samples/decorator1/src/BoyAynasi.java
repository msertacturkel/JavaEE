
public class BoyAynasi extends AynaDecorator {

	@Override
	public void produce() {	
		getAyna().produce();
		boyUzat();
	}
	
	public void boyUzat(){
		System.out.println("boyu uzadi..");
	}
}
