

/**
 * Degisik tipte aynali �r�nleri
 * temsil eden �stsinif.
 * 
 * @author Oezcan Acar
 *
 */
public abstract class AynaDecorator implements EvEsyalari
{
	/*
	 * B�nyesinde mevcut bir ayna nesnesi
	 * bulundurur ve degisik metodlar kullanarak
	 * bu ayna nesnesini dekore eder.
	 */
	private EvEsyalari ayna = new Ayna();

	public EvEsyalari getAyna()
	{
		return ayna;
	}

	public void setAyna(EvEsyalari ayna) 
	{
		this.ayna = ayna;
	}	
}
