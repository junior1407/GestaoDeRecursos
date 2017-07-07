import java.util.HashMap;
import java.util.Map;

public class ArrayList {

	public ArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Integer i1 = new Integer(7);
		  Integer i2 = new Integer(8);
		  Integer i3 = new Integer(9);
		  Integer i4 = new Integer(10);
				
		  java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
		  list.add(i4);
		  list.add(i3);
		  list.add(i2);
		  list.add(i1);
				
		  System.out.println(list);
		  
		  java.util.ArrayList<Admin> admins = new java.util.ArrayList<Admin>();
		  
		  Admin admin1 = new Admin( );
		  admin1.name = "joao";
		  Admin admin2 = new Admin( );
				
		  admins.add(admin1);
		  admins.add(admin2);
		  		
		  System.out.println(admins.get(0).name);
		  
		  Map<Integer,String> students = new HashMap<Integer,String>();
			
		  students.put(1, "Gabriel");
		  students.put(2, "Leonildo");
		  students.put(3, "Carlos");
		  students.put(4, "Luan");
		  students.put(5, "Tamirys");
		  students.put(6, "Laylla");
				
		  System.out.println(students);
		  System.out.println("ID = 1 --> " + students.get(1));


	}

}
