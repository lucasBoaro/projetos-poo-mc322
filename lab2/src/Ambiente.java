public class Ambiente {

    int larguraX;
    int alturaY;
    Robo[] arrayRobo = new Robo[10];
    static int contadorRobo=0;
    public Ambiente(int larguraX, int alturaY) {
        this.larguraX=larguraX;
        this.alturaY=alturaY;
    }

    public boolean dentroDosLimites(int x, int y, String nome) {
        if( (x <= larguraX && y <= alturaY) && (x >= 0 && y >= 0)){
            System.out.printf("%s dentro dos limites\n", nome);
            return true;
        }
        else{
            System.out.printf("%s fora dos limites\n", nome);
            return false;
        }

    }

    public void adicionarRobo(Robo robo){
        arrayRobo[contadorRobo]=robo;
        contadorRobo++;
    }
    public boolean dentroDaAltura(int alturaMaxima, int altura, String nome){
        if (alturaMaxima <altura || altura<0 ) {
            System.out.printf("%s: Altura inválida\n",nome);
            return false;
        }
        else{
            System.out.printf("%s: Altura válida\n",nome);
            return true;
        }
    }
    //colocar a verificação aqui, e não no main
}
