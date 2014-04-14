import java.util.ArrayList;
import java.util.List;

//Composite

public class CompositeGraphic implements Graphic {

	List<Graphic> childGraphic=new ArrayList<Graphic>();
	
	public void add(Graphic gr){
		childGraphic.add(gr);
	}
	
	public void remove(Graphic gr){
		childGraphic.remove(gr);
	}
	public void print() {
		for (Graphic gr: childGraphic) {
			gr.print();
		}

	}

}
