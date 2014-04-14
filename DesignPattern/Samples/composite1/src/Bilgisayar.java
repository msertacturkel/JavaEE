import java.util.ArrayList;

public class Bilgisayar implements Parca {

	private ArrayList<Parca>parcalar = new ArrayList<Parca>();

	public void ekle(Parca parca) {
		parcalar.add(parca);
	}

	public void sil(Parca parca) {
		if (parcalar.contains(parca))
			parcalar.remove(parca);
	}

	public Parca parcaVer(int no) {
		Parca parca = null;
		parca = parcalar.get(no);
		if (parca == null)
			throw new ParcaYokHatasi(no + " nolu parca bulunamadi..");
		return parca;
	}

	public ArrayList<Parca> parcaListesi() {
		return parcalar;
	}

	@Override
	public int fiyat() {
		int fiyat = 0;
		for (int i = 0; i <parcalar.size(); i++) {
			fiyat += parcalar.get(i).fiyat();
		}
		return fiyat;
	}

}

