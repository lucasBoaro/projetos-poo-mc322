public class RoboTurbo extends RoboTerrestre{
    boolean turboDisponivel;//turbo faz a velocidade valer 2x

    public RoboTurbo(String nome, int posicaoX, int posicaoY, int velocidadeMaxima, Ambiente ambiente) {
        super(nome, posicaoX, posicaoY, velocidadeMaxima, ambiente);
        turboDisponivel=false;
    }
    public void HabilitarTurbo() {
        turboDisponivel = true;
    }
    public void DesabilitarTurbo() {
        turboDisponivel = false;
    }
    @Override
    public void Mover(int deltaX, int deltaY,String nome) {
        if (turboDisponivel) {//se turbo estiver ligado, ele se descolará 2 vezes mais no mesmo período de tempo
            super.Mover(2*deltaX, 2*deltaY,nome);
        }
        else {
            super.Mover(deltaX, deltaY,nome);
        }
    }
}
