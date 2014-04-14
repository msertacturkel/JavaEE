import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {
		Locale l[] = Locale.getAvailableLocales();

		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i].getLanguage() + "-" + l[i].getCountry()
					+ "-" + l[i].getVariant());
		}
	}

}
