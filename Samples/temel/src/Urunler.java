import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Urunler implements java.io.Serializable {

	private List<Urun> urunler;
	

	public Urunler() {
		urunler = new ArrayList<Urun>();
		urunler.add(new Urun("elma", "elm", 5));
		urunler.add(new Urun("portakal", "port", 4));
		urunler.add(new Urun("nar", "nr", 6));
	}

	public Urun getUrun(String kod1) {
		Urun urun = null;
		for (Urun urun1 : urunler) {
			if (urun1.getKod().equals(kod1))
				urun = urun1;
		}
		return urun;
	}

	public Set<String> getKodlar() {
		TreeSet<String> kodlar = new TreeSet<String>();
		for (Urun urun : urunler) {
			kodlar.add(urun.getKod());
		}
		return kodlar;
	}
	
	public List<Urun> getUrunler(){
		return urunler;
	}
}
