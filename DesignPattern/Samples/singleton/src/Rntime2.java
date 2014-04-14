public class Rntime2 {
	//singleton degil
	private static int i = 0;
	private static Rntime2 rn2;

	private Rntime2() {
	}

	public static Rntime2 getRntime() {
		if (i++ < 2) {
			rn2= new Rntime2();
		}
		return rn2;
	}

	public int freeMemory() {
		return 5;
	}
}
