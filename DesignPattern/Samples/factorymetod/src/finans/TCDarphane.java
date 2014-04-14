package finans;

public class TCDarphane extends Darphane {
	private String sembol;

	public TCDarphane(String sembol) {
		this.sembol = sembol;
	}

	@Override
	public Para paraBas(int nominalDeger) {
		Para l = new Lira(nominalDeger, sembol);
		return l;
	}

	public String toString() {

		return "Türkiyenin darphanesi";
	}

}
