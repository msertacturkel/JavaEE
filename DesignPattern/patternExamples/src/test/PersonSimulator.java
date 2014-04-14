package test;

import java.util.ArrayList;

import com.darklord.strategy.GoodbyeGerman;
import com.darklord.strategy.GoodbyeTurkish;
import com.darklord.strategy.HelloGerman;
import com.darklord.strategy.HelloTurkish;
import com.darklord.strategy.Jump;
import com.darklord.strategy.Person;
import com.darklord.strategy.Run;

public class PersonSimulator implements Runnable {
	
	@Override
	public void run() {
		Person germanRunner = new Person("Wilhelm Renner", 0, 0, new HelloGerman(), new GoodbyeGerman(), new Run());
		Person turkishJumper = new Person("Bahri Ziplak", 0, 0, new HelloTurkish(), new GoodbyeTurkish(), new Jump());
		Person turkishGermanRunner = new Person("Tunç Werner", 0, 0, new HelloTurkish(), new GoodbyeGerman(), new Run());
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(germanRunner);
		persons.add(turkishJumper);
		persons.add(turkishGermanRunner);
		
		for (Person person : persons)
		{
			person.introduce();
			person.moveTo(20, 40);
			person.leaveAndGoTo(0, 0);
			System.out.println();
		}
		
		turkishGermanRunner.setMoveBehavior(new Jump());
		
		System.out.println("After Tunç decides to jump rather than run like Germans did...");
		
		for (Person person : persons)
		{
			person.introduce();
			person.moveTo(20, 40);
			person.leaveAndGoTo(0, 0);
			System.out.println();
		}
	}

}
