public class RoboAereo extends Robo{

    int altitude, altitudeMaxima;
    public RoboAereo(String nome,int posicaoX,int posicaoY,int altitude,int altitudeMaxima,Ambiente ambiente) {

        super(nome,posicaoX,posicaoY,ambiente);
        this.altitude=altitude;
        this.altitudeMaxima=altitudeMaxima;

        
    }
    public void Subir(int metros){
        if (ambiente.dentroDaAltura(altitudeMaxima,altitude+metros,nome)) {
            altitude+=metros;
        }

    }
    public void Descer(int metros){
        if (ambiente.dentroDaAltura(altitudeMaxima,altitude+metros,nome)) {
            altitude-=metros;
        }

    }
    //sobrescrever exibir posição, pois precisamos colocar a altura também
    @Override
    public void exibirPosicao() {
        System.out.printf("%s: (%d,%d), com altura: %d\n",nome,posicaoX,posicaoY,altitude);
    }
}
