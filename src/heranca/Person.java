package heranca;

public class Person {

	public String name = "Paulo";
	private String lastName;
	String y;
	protected String firstName;
	
	public Person(){
		
	}
	
	public Person(String n) {
	
		super();
		this.name = n;
		
	}

	public void hello(String hello){
		System.out.println("Superclasse");
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
	
	
}
