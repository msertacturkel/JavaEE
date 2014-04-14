package finans;

public class Lira extends Para {
	// package visibility
	Lira(int nominalDeger, String sembol) {
		super.nominalDegeri = nominalDeger;
		super.sembol = sembol;
	}

	@Override
	public String toString() {
		return nominalDegeri + " " + sembol;
	}

}
