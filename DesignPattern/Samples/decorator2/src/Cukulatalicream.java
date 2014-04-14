
public class Cukulatalicream extends IcecreamDecorator {

	public Cukulatalicream(Icecream specialIcecream) {
		super(specialIcecream);

	}

	public String makeIcecream() {
		return specialIcecream.makeIcecream()+cukulataEkle();
	}
	
	public String cukulataEkle(){
		return "cukulata ekle";
	}

}
