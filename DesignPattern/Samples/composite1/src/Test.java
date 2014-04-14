public class Test {
	public static void main(String[] args) {
		Bilgisayar bilgisayar = new Bilgisayar();
		Parca monitor = new Monitor();
		Parca klavye = new Klavye();
		Parca fare = new Fare();
		bilgisayar.ekle(monitor);
		bilgisayar.ekle(fare);
		bilgisayar.ekle(klavye);
		System.out.println("monitor fiyati:" + monitor.fiyat());
		System.out.println("bilgisayar fiyati:" + bilgisayar.fiyat());
	}
}
