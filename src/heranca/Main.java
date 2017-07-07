package heranca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public Main() {
	
		
	}
	
	public void testando(Person person){
		
		person.hello("");
		
		if (person instanceof Student) {
			((Student)person).teste();
		}else if (person instanceof Sub2) {
			((Sub2)person).teste();
		}
		else{
			System.out.println("nao tem instancia");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Sub2();
		
		Main main = new Main();
		main.testando(person);
		
		List<Person> list = new ArrayList<Person>();
		list.set(0, person);
		
	}

}
