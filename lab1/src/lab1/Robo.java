package lab1;

public class Robo {
	
	String nome;
	int posicaoX;
	int posicaoY;
	
	public Robo(String nome,int posicaoX,int posicaoY) { //construtor
		this.nome=nome;
		this.posicaoX=posicaoX;
		this.posicaoY=posicaoY;
		
	}
	
	public void Mover(int deltaX, int deltaY) { //void pois não eh um construtor, precisa retornar algo
		this.posicaoX+=deltaX;
		this.posicaoY+=deltaY;
	}
	
	public void exibirPosicao() {
		System.out.printf("%s: (%d,%d)\n",nome,posicaoX,posicaoY);
	}
	
}
