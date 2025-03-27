import java.util.Arrays; //importado para colocar null nos arrays

public class Ambiente {

    int larguraX;
    int alturaY;
    Robo[][] matrizAmbiente = new Robo[100][100];
    Robo[] arrayRobo = new Robo[10];
    static int contadorRobo=0; //static diz que o valor desse atributo é da classe, e não só de uma instancia especifica

    public Ambiente(int larguraX, int alturaY) {
        this.larguraX=larguraX;
        this.alturaY=alturaY;
        for (Robo[] linha : matrizAmbiente) { // for each--> linha por linha na matriz arrayAmbiente
            Arrays.fill(linha, null);//coloca a linha inteira como null
        }
    }

    public boolean dentroDosLimites(int x, int y, String nome) { //função que verifica se, com o movimento, ele ficará dentro dos limites
        if( (x <= larguraX && y <= alturaY) && (x >= 0 && y >= 0)){
            System.out.printf("%s dentro dos limites\n", nome);
            return true;
        }
        else{
            System.out.printf("%s fora dos limites\n", nome);
            return false;
        }

    }

    public void adicionarRobo(Robo robo){ //add robo na lista de robos
        arrayRobo[contadorRobo]=robo;
        adicionarNaMatriz(robo);
        contadorRobo++;
    }
    public boolean dentroDaAltura(int alturaMaxima, int altura, String nome){ // verifica se o movimento de subir/descer não vai infrigir as regras
        if (alturaMaxima <altura || altura<0 ) {
            System.out.printf("%s: Altura inválida\n",nome);
            return false;
        }
        else{
            System.out.printf("%s: Altura válida\n",nome);
            return true;
        }
    }
    public void adicionarNaMatriz(Robo robo){
        matrizAmbiente[robo.posicaoX][robo.posicaoY]=robo;
    }

    public void identificarObstaculo(int i, int j){
        if(i+1<larguraX && matrizAmbiente[i+1][j] != null ){
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i+1,j);
        }
        if(i-1>=0 && matrizAmbiente[i-1][j] != null ){
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i-1,j);
        }
          if(j+1<alturaY && matrizAmbiente[i][j+1] != null ){
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i,j+1);
        }
          if(j-1>=0 && matrizAmbiente[i][j-1] != null ){
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i,j-1);
        }
          if (j+1<alturaY && i+1<larguraX && matrizAmbiente[i+1][j+1] != null) {
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i+1,j+1);
        }
          if (j-1>=0 && i+1<larguraX && matrizAmbiente[i+1][j-1] != null) {
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i+1,j-1);
        }
          if (j-1>=0 && i-1>=0 && matrizAmbiente[i-1][j-1] != null) {
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i-1,j-1);
        }
          if (j+1<alturaY && i-1>=0 && matrizAmbiente[i-1][j+1] != null) {
            System.out.printf("Obstáculo enontrado em (%d,%d)\n",i-1,j+1);
        }
    }

    //colocar a verificação aqui, e não no main
}
