package test;

import java.util.ArrayList;

import com.darklord.decorator.Civilian;
import com.darklord.decorator.DrawableComponent;
import com.darklord.decorator.EquippedSoldier;
import com.darklord.decorator.IntelligentSoldier;
import com.darklord.decorator.MP5;
import com.darklord.decorator.Soldier;
import com.darklord.decorator.VisualRectangle;

public class DrawingSimulator implements Runnable {

	@Override
	public void run() {
		
		VisualRectangle rectangle = new VisualRectangle(10, 20, 400, 200);
		Civilian civil = new Civilian("Farmboy", 100, 20, 20);
		Soldier soldier = new Soldier("Arthur", 250, 20, 5);
		EquippedSoldier equippedSoldier = new EquippedSoldier(soldier);
		IntelligentSoldier intelligentSoldier = new IntelligentSoldier(soldier);
		IntelligentSoldier intelligentAndEquippedSoldier = new IntelligentSoldier(equippedSoldier);
		MP5 mp5 = new MP5(50, 100, 100);
		
		equippedSoldier.equip(mp5);
		
		components.add(rectangle);
		components.add(civil);
		components.add(soldier);
		components.add(equippedSoldier);
		components.add(intelligentSoldier);
		components.add(intelligentAndEquippedSoldier);
		
		loop();
		
		System.out.println();
		System.out.println("Second loop");
		System.out.println();
		
		equippedSoldier.unequip(mp5);
		
		loop();
	}
	
	void loop() {
		for (DrawableComponent dcomponent : components) {
			dcomponent.update();
			dcomponent.draw();
			System.out.println();
		}
	}
	
	ArrayList<DrawableComponent> components = new ArrayList<DrawableComponent>();

}
