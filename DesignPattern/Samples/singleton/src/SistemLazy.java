import java.io.PrintStream;

public class SistemLazy {

	// lazy singleton
	private static PrintStream pr;

	private SistemLazy() {
	}

	public static PrintStream out() {
		if (pr == null)
			pr = new PrintStream(System.out);
		return pr;
	}

}
