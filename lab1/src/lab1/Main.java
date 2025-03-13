package lab1;

public class Main {
	public static void main(String[] args) { // Método main (obrigatório)
		
		
		
		
		int xAmbiente = 10;
		int yAmbiente = 10;
		Ambiente ambiente1 = new Ambiente(xAmbiente,yAmbiente);
		
		
		String nome1 = "Robocop";
		String nome2 = "Robozao";
		int xRobo1 = 0;
		int xRobo2 = 5;
		int yRobo1 = 0;
		int yRobo2 = 0;
		
		Robo robo1 = new Robo(nome1,xRobo1,yRobo1);
		Robo robo2 = new Robo(nome2,xRobo2,yRobo2);
		int xDelta = 6;
		int yDelta = 7;
		
		robo1.Mover(xDelta, yDelta);
		robo2.Mover(xDelta, yDelta);
		
		boolean limitePossivel = ambiente1.dentroDosLimites(robo1.posicaoX, robo1.posicaoY);
		if(limitePossivel == true) {
			System.out.printf("%s dentro dos limites\n", robo1.nome);
		}
		else {
			System.out.printf("%s fora dos limites\n",robo1.nome);
		}
		limitePossivel = ambiente1.dentroDosLimites(robo2.posicaoX, robo2.posicaoY);
		if(limitePossivel == true) {
			System.out.printf("%s dentro dos limites\n", robo2.nome);
		}
		else {
			System.out.printf("%s fora dos limites\n", robo2.nome);
		}
		
		robo1.exibirPosicao();
		robo2.exibirPosicao();
		
		

		
		
	
	}
}
