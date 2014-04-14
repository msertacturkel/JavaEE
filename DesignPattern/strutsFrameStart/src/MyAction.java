public class MyAction{
	private String ad;
	private String soyad;
	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		System.out.println(soyad);
		this.soyad = soyad;
	}

	public void setAd(String ad) {
		System.out.println(ad);
		this.ad=ad;
	}

	public String getAd() {
		return ad;
	}
}
