
public class Personel {
private int id;
private String ad;
private String soyad;
int maas;

public Personel(int id, String ad, String soyad, int maas) {
	super();
	this.id = id;
	this.ad = ad;
	this.soyad = soyad;
	this.maas = maas;
}
public Personel() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad(String soyad) {
	this.soyad = soyad;
}
public int getMaas() {
	return maas;
}
public void setMaas(int maas) {
	this.maas = maas;
}

}
