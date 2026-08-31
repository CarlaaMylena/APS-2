
public class Principal {
	public static void main (String[]args) {
	
		Carro carro = new Carro();
		Bicicleta bike = new Bicicleta();
				
		Pista pista = new Pista();
		System.out.println(pista.iniciarCorrida(bike));
		System.out.println(pista.iniciarCorrida(bike));
	}

}
