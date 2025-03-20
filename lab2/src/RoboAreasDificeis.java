public class RoboAreasDificeis extends RoboTerrestre{ //robo que só é usado para áreas que são de dificil trajeto
    boolean tracao4x4;
    public RoboAreasDificeis(String nome, int posicaoX, int posicaoY, int velocidadeMaxima, Ambiente ambiente) {
        super(nome, posicaoX, posicaoY, velocidadeMaxima, ambiente);
        tracao4x4=false;
    }
    public void HabilitarTracao4x4() {
        tracao4x4 = true;
    }
    public void DesabilitarTracao4x4() {
        tracao4x4 = false;
    }
    @Override
    public void Mover(int deltaX, int deltaY,String nome) {
        if(tracao4x4){ //se a tração está habilitada, ele anda normal
            super.Mover(deltaX, deltaY,nome);
        }
        else{
            super.Mover(deltaX/2, deltaY/2,nome);
        }
    }
}
