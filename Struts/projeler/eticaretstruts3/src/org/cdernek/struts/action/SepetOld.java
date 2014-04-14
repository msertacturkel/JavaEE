package org.cdernek.struts.action;
import java.util.ArrayList;
import java.util.List;


public class SepetOld implements java.io.Serializable{

	 private List urunler;

	public SepetOld() {
		urunler=new ArrayList();
		//System.out.println("sepet constr");
	}
	 
	public void ekle(UrunOLD urun){
		urunler.add(urun);		
		//sSystem.out.println(urunler.size());
	}
	 
	public List getUrunler(){
		return urunler;
	}
	 
	public boolean sil(UrunOLD urun){
		return urunler.remove(urun);		
	}
	
	
	 
}
