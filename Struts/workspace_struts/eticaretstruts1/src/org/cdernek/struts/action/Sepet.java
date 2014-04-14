package org.cdernek.struts.action;
import java.util.ArrayList;
import java.util.List;


public class Sepet implements java.io.Serializable{

	 private List urunler;

	public Sepet() {
		urunler=new ArrayList();
		//System.out.println("sepet constr");
	}
	 
	public void ekle(Urun urun){
		urunler.add(urun);		
		//sSystem.out.println(urunler.size());
	}
	 
	public List getUrunler(){
		return urunler;
	}
	 
	public boolean sil(Urun urun){
		return urunler.remove(urun);		
	}
	
	
	 
}
