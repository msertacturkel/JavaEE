public class IsikliAyna extends AynaDecorator {
	@Override
	public void produce() {
		getAyna().produce();
		isikEkle();
	}

	public void isikEkle() {
		System.out.println("isik eklendi..");
	}
}
