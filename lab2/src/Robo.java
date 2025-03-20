
public class Robo {
    Ambiente ambiente;
    String nome;
    String direcao;
    int posicaoX;
    int posicaoY;

    public Robo(String nome,int posicaoX,int posicaoY,Ambiente ambiente) { //construtor
        this.nome=nome;
        this.posicaoX=posicaoX;
        this.posicaoY=posicaoY;
        this.ambiente=ambiente;
    }

    public void Mover(int deltaX, int deltaY,String nome) { //void pois não eh um construtor, precisa retornar algo
        if (!ambiente.dentroDosLimites(posicaoX+deltaX,posicaoY+deltaY, nome)) {
            return;
        }
        this.posicaoX+=deltaX;
        this.posicaoY+=deltaY;
    }
    public void identificarObstaculo(){


    }

    public void exibirPosicao() {
        System.out.printf("%s: (%d,%d)\n",nome,posicaoX,posicaoY);
    }

}

