public class RoboAereoMilitar extends RoboAereo{
    boolean misselDisponivel;
    public RoboAereoMilitar(String nome, int posicaoX, int posicaoY, int altitude, int altitudeMaxima, Ambiente ambiente) {
        super(nome,posicaoX,posicaoY,altitude,altitudeMaxima,ambiente);
        misselDisponivel=false;
    }
    public void CarregarMissel(){
        misselDisponivel=true;
    }
    public void LancarMissel(){
       if (!misselDisponivel){
           System.out.printf("%s: Missel indisponivel\n",nome);
       }
       else{
           System.out.printf("%s: Missel lançado\n",nome);
       }
    }
}
//podemos juntas essas verificações num metodo só e ir chamando
