import java.lang.Math;
public class RoboTerrestre extends Robo{


    int velocidadeMaxima;

    public RoboTerrestre(String nome,int posicaoX,int posicaoY,int velocidadeMaxima,Ambiente ambiente) {
        super(nome,posicaoX,posicaoY,ambiente);
        this.velocidadeMaxima=velocidadeMaxima;
    }

    @Override
    public void Mover(int deltaX, int deltaY,String nome) {
        if (Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2)) > (velocidadeMaxima)) {
            System.out.printf("%s: Velocidade maxima excedida\n",nome);
            return;
        }
        super.Mover(deltaX, deltaY,nome);
    }

}