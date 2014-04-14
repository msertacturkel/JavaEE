package mypack;
import java.util.ArrayList;
import java.util.List;

public class Sepet {

	private List<Urun> urunler;

	public Sepet() {
		urunler = new ArrayList<Urun>();
	}

	public void ekle(Urun urun) {
		urunler.add(urun);
	}

	public List<Urun> getUrunler() {
		return urunler;
	}

	public boolean sil(Urun urun) {
		System.out.println(urun.getAd()+"sildi");
		
		urunler.remove(urun);
		return true;
	}
}
