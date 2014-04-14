package test;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable currentProject;
		//PersonSimulator personSimulator = new PersonSimulator();
		//DrawingSimulator drawingSimulator = new DrawingSimulator();
		CustomFileInputTest customFile = new CustomFileInputTest();
		
		currentProject = customFile;
		
		currentProject.run();
	}

}
