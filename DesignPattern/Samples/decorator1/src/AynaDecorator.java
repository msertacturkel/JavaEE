
public abstract class AynaDecorator implements EvEsyasi {

	protected EvEsyasi ayna;
	
	public EvEsyasi getAyna(){
		return ayna;
	}
	public void setAyna(EvEsyasi ayna){
		this.ayna=ayna;
	}
	
	public void produce() {
		ayna.produce();

	}

}
