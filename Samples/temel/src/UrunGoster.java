import java.util.Set;

public class UrunGoster {
	public static void main(String[] args) {
		Urunler urunler = new Urunler();
		Set<String> kodlar = urunler.getKodlar();
		for (String kod : kodlar) {			
			System.out.println(kod+"-->"+urunler.getUrun(kod).getFiyat());
		}
		
		for(Urun urun:urunler.getUrunler()){
			System.out.println(urun.getAd());
		}
		
	}
}
