import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;



public class MyActionF {

	private String ad, soyad;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		System.out.println("merhaba   "+ad);
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public void validateEmail(FacesContext context, UIComponent toValidate,
			Object value) throws ValidatorException {
		System.out.println("validate email");
	}


}
