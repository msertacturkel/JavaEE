public class FindikliIcecream extends IcecreamDecorator {

	public FindikliIcecream(Icecream specialIcecream) {
		super(specialIcecream);
	}

	public String makeIcecream() {
		// TODO Auto-generated method stub
		return super.makeIcecream()+findikEkle();
	}

	public String findikEkle(){
		return "findik eklendi";
	}
}
