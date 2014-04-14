

/**
 * Cerceveli ayna �retimi
 * yapmak icin kullanilan
 * sinif.
 * 
 * @author Oezcan Acar
 *
 */
public class CerceveliAyna extends AynaDecorator
{

	/**
	 * �retim icin kullanilan sinif.
	 * addBorder metodu ile
	 * aynaya cerceve ekler.
	 */
	public void produce() 
	{
		getAyna().produce();
		addBorder();
	}
	
	/**
	 * Cerceve ekleme islemini gerceklestirmek
	 * icin kullanilan metod.
	 * 
	 */
	public void addBorder()
	{
		System.out.println("Aynaya cerceve eklendi.");
	}
}
