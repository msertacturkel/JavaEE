package finans;

public class Lira extends Para{

	protected Lira(int nominalDeger, String sembol) {
		super.nominalDegeri = nominalDeger;
		super.sembol = sembol;

	}
	
	public String toString()
	{
		return nominalDegeri + " " + sembol;		
	}


}
