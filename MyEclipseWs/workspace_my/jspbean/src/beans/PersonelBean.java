package beans;

import java.util.List;

import dao.Personel;
import dao.PersonelDao;

public class PersonelBean {

	private int id;
	private String ad;
	private String soyad;
	private int maas;
	private String table;
	
	public PersonelBean() {	}

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
	
	public List<Personel> findAll(){
		PersonelDao pdao=new PersonelDao();
		return pdao.findAll();
	}
	
	public List<Personel> findByAd(String ad){
		PersonelDao pdao=new PersonelDao();
		return pdao.findByAd(ad);
	}
	
	/*public String getTable(){
		String str="<table border='1'>";
		List<Personel> pers=findAll();
		for (Personel personel : pers) {
			str+="<tr><td>"+personel.getAd()+"</td><td>"+personel.getSoyad()+"</td></tr>";
		}
		return str;
	}*/
	public String getTable(){
		String str="<table border='1'>";
		List<Personel> pers=findByAd(ad);
		for (Personel personel : pers) {
			str+="<tr><td>"+personel.getAd()+"</td><td>"+personel.getSoyad()+"</td></tr>";
		}
		return str;
	}
}
