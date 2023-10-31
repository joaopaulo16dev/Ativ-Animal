package animal;

public class Gato extends Animal{
	
	public Gato(String nome,String sexo,String raca) {
		super(nome,sexo,raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O gato esta uivando");
	}
	@Override
	public void dormir() {
		System.out.println("O gato esta dormir ");
	}
	@Override
	public void caminhar() {
		System.out.println("O gato esta caminhar");
	}
	@Override
	public void correr() {
		System.out.println("O gato esta correndo");
	}

}
