import java.util.ArrayList;


public abstract class MetalPara {
	/**
	 * Otomata atilan paralarin tutuldugu liste
	 */
	private ArrayList metalParaListesi = new ArrayList();
	/**
	 * Metal paranin sahip olduðu deðer. 5, 10, 50, 100 Kurus olabilir
	 */
	private int value;
	/**
	 * Zincirde yeralan bir sonraki nesne
	 */
	private MetalPara next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public MetalPara getNext() {
		return next;
	}

	public MetalPara setNext(MetalPara next) {
		this.next = next;
		return this;
	}

	public void check(MetalPara para) {
		System.out.println("Siradaki nesne sadece " + this + " isleyebilir.");
		if (para.getValue() != this.value) {
			System.out.println("Uymadi, zincirdeki bir "
					+ "sonraki nesneye iletiyoruz.");
			if (getNext() != null) {
				getNext().check(para);
			} else {
				System.out
						.println("Zincirin sonundayiz. " + "Metal para "
								+ para.toString() + " "
								+ "bu otomat için uygun degil.");
			}
		} else {
			metalParaListesi.add(para);
			System.out.println("Otomat tarafindan " + this.toString()
					+ " kabul edildi");
		}
	}
}
