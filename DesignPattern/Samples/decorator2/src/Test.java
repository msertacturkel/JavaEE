
public class Test {

	public static void main(String[] args) {
		Icecream simple = new SimpleIcecream();
		System.out.println(simple.makeIcecream());
		Icecream findik = new FindikliIcecream(new SimpleIcecream());
		System.out.println(findik.makeIcecream());
		Icecream icecream = new Cukulatalicream(new FindikliIcecream(
				new SimpleIcecream()));
		System.out.println(icecream.makeIcecream());

	}

}
