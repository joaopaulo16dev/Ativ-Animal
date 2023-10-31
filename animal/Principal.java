package animal;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("thor", "M", "qualquer");
		lobo.emitirSom();
		
		Leao leao= new Leao("thor", "M", "qualquer");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("thor", "M", "qualquer");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro("thor", "M", "qualquer");
		cachorro.emitirSom();
		
		Gato gato = new Gato("thor", "M", "qualquer");
		gato  .emitirSom();
	}

}
