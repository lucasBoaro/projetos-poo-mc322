package lab1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { // Método main (obrigatório)
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Coloque a largura e altura do ambiente");
		int xAmbiente = scanner.nextInt();
		int yAmbiente = scanner.nextInt();
		Ambiente ambiente1 = new Ambiente(xAmbiente,yAmbiente);
		
		String nome = scanner.nextLine();
		int xRobo = scanner.nextInt();
		int yRobo = scanner.nextInt();
		Robo robo1 = new Robo(nome,xRobo,yRobo);
		
		int xDelta = scanner.nextInt();
		int yDelta = scanner.nextInt();
		
		robo1.Mover(xDelta, yDelta);
		boolean limitePossivel = ambiente1.dentroDosLimites(xDelta, yDelta);
		System.out.println();
		
		
		
	
	}
}
