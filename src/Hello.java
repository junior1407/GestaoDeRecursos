
public class Hello {

	public Hello() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		SimpleLocation ic = new SimpleLocation();
		SimpleLocation ufal = new SimpleLocation(20);
		
		ic.distance(ufal);
			
		Empregado empregado = new Empregado();
		empregado.nome = "Nome";
	}

}
