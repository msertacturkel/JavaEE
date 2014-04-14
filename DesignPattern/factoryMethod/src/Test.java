import finans.Lira;
import finans.TcDarphane;

public class Test {

	public static void main(String[] args) {
		TcDarphane tc = new TcDarphane();
		Lira lira = (Lira) tc.paraBas(50);
		System.out.println(lira);
	}

}
