public class RoboAereoBateria extends RoboAereo{
    int bateria;
    public RoboAereoBateria(String nome, int posicaoX, int posicaoY, int altitude, int altitudeMaxima, int bateria, Ambiente ambiente) {
        super(nome,posicaoX,posicaoY,altitude,altitudeMaxima,ambiente);
        this.bateria=bateria;
    }
    @Override
    public void Mover(int deltaX, int deltaY,String nome) {//metodo novo que mexe e verifica a bateria
        if (bateria-10 <= 0) {
            System.out.printf("%s: Bateria insuficiente\n",nome);
            return;
        }
        bateria-=10;
        super.Mover(deltaX, deltaY,nome);


    }
    @Override
    public void Subir(int metros){
        if (bateria-10 >= 0) {
            bateria-=10;
            super.Subir(metros);
        }
        else{
            System.out.printf("%s: Bateria insuficiente\n",nome);
        }
    }
    @Override
    public void Descer(int metros){
        if (bateria-10 >= 0) {
            bateria-=10;
            super.Descer(metros);
        }
        else{
            System.out.printf("%s: Bateria insuficiente\n",nome);
        }
    }


}
