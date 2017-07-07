package heranca;

public class Student extends Person {

	private String mat=  "mat";
	
	public Student(String n) {
		// TODO Auto-generated constructor stub
		super(n);
	}

	public Student(){
		this("Student");
	}
	
	public void hello(String hello){
		System.out.println("Student");
	}
	
	public void teste( ){
		System.out.println("Teste Student");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.mat;
	}
}
