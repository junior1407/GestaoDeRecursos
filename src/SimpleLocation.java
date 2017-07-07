
public class SimpleLocation {

	private double latitude = 10;
	private double longitude;
	
	public SimpleLocation() {
		// TODO Auto-generated constructor stub
	}
	
	public SimpleLocation(double latitude ) {
		this.latitude = latitude;
	}

	public double distance(SimpleLocation other){
		
		System.out.println("This"+this.latitude);
		System.out.println("Other"+other.latitude);
		
		return this.latitude-other.latitude;
	}
	
	
}
