package finans;

public class TcDarphane extends Darphane {

	@Override
	public Para paraBas(int nominalDeger) {
		Para l = new Lira(nominalDeger, "TL");
		return l;

	}

	public String toString() {

		return "Türkiyenin darphanesi";
	}

}
