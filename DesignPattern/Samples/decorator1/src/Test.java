public class Test {

	public static void main(String[] args) {

		Ayna ayna = new Ayna();		
		CerceveliAyna cerceve = new CerceveliAyna();		
		BoyAynasi boy = new BoyAynasi();
		IsikliAyna isik = new IsikliAyna();
		cerceve.setAyna(ayna);
		boy.setAyna(cerceve);
		isik.setAyna(boy);
		isik.produce();
	}

}
