package mypack;
import java.util.Set;


public class SepetDoldurGoster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Urunler urunler = new Urunler();
		Sepet sepet=new Sepet();
		for(Urun urun:urunler.getUrunler()){
			//System.out.println(urun.getAd());
			sepet.ekle(urun);
		}
		
		for(Urun urun:sepet.getUrunler()){
			System.out.println(urun.getAd());
		}

	}

}
