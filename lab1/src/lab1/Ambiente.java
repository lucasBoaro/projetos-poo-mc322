package lab1;

public class Ambiente {

	int larguraX;
	int alturaY;
	
	
	public Ambiente(int larguraX, int alturaY) {
		this.larguraX=larguraX;
		this.alturaY=alturaY;
	}
	
	public boolean dentroDosLimites(int x, int y) {
		
		return ((x<=larguraX && y<=alturaY) || (x<=0 && y>=0)) ;
			
		
	}
}

