public class Test {

	public static void main(String[] args) {
		// Initialize four ellipses
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse();
		Circle circ = new Circle();
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		// Initialize three composite graphics
		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();

		// Composes the graphics
		graphic1.add(ellipse1);
		graphic1.add(ellipse2);
		graphic1.add(circ);

		graphic2.add(rect1);
		graphic2.add(rect2);
		graphic.add(graphic1);
		graphic.add(graphic2);

		// Prints the complete graphic (four times the string "Ellipse").
		graphic.print();

	}

}
