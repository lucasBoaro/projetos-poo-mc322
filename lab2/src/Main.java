public class Main {
    public static void main(String[] args) { // Método main (obrigatório)



        int xAmbiente = 50;
        int yAmbiente = 50;
        Ambiente ambiente1 = new Ambiente(xAmbiente,yAmbiente);


        String nome1 = "Robocop";
        String nome2 = "Robozao";
        String nome3 = "Hugo Souza";
        int xRobo1 = 0;
        int xRobo2 = 5;
        int yRobo1 = 0;
        int yRobo2 = 0;

        Robo robo1 = new Robo(nome1,xRobo1,yRobo1,ambiente1);
        RoboAereo robo2 = new RoboAereo(nome2,xRobo2,yRobo2,5,20,ambiente1);
        RoboTerrestre robo3 = new RoboTerrestre(nome3,5,5,20,ambiente1);
        RoboAereoMilitar robo4 = new RoboAereoMilitar("vini",1,3,5,50,ambiente1);
        RoboAereoBateria robo5 = new RoboAereoBateria("julio cesar ex fla",0,0,5,50,20,ambiente1);
        RoboAreasDificeis robo6 = new RoboAreasDificeis("Mateus bidu",0,2,60,ambiente1);
        RoboTurbo robo7 = new RoboTurbo("Robson Bambu",0,0,100,ambiente1);
        ambiente1.adicionarRobo(robo1);
        ambiente1.adicionarRobo(robo2);
        ambiente1.adicionarRobo(robo3);
        ambiente1.adicionarRobo(robo4);
        ambiente1.adicionarRobo(robo5);
        ambiente1.adicionarRobo(robo6);
        ambiente1.adicionarRobo(robo7);
        int xDelta = 6;
        int yDelta = 7;

        robo1.Mover(xDelta, yDelta,nome1);
        robo2.Mover(xDelta, yDelta,nome2);
        robo2.Subir(10);
        robo3.Mover(40,80,nome3);
        robo2.Descer(10);
        robo4.CarregarMissel();
        robo4.LancarMissel();
        for(int i=0;i<3;i++) {
            robo5.Subir(10);
        }
        robo6.HabilitarTracao4x4();
        robo6.Mover(4,5,robo6.nome);
        robo7.HabilitarTurbo();
        robo7.Mover(10,10,robo7.nome);

        for(int i = 0; i< Ambiente.contadorRobo; i++) {
            ambiente1.dentroDosLimites(ambiente1.arrayRobo[i].posicaoX,ambiente1.arrayRobo[i].posicaoY,ambiente1.arrayRobo[i].nome);
        }
        ambiente1.dentroDosLimites(robo1.posicaoX, robo1.posicaoY,robo1.nome);
        ambiente1.dentroDosLimites(robo2.posicaoX, robo2.posicaoY,robo2.nome);
        ambiente1.dentroDosLimites(robo3.posicaoX, robo3.posicaoY,robo3.nome);
        ambiente1.dentroDosLimites(robo4.posicaoX, robo4.posicaoY,robo4.nome);
        ambiente1.dentroDosLimites(robo5.posicaoX, robo5.posicaoY,robo5.nome);
        ambiente1.dentroDosLimites(robo6.posicaoX, robo6.posicaoY,robo6.nome);
        ambiente1.dentroDosLimites(robo7.posicaoX, robo7.posicaoY,robo7.nome);




        robo1.exibirPosicao();
        robo2.exibirPosicao();
        robo3.exibirPosicao();
        robo4.exibirPosicao();
        robo5.exibirPosicao();
        robo6.exibirPosicao();
        robo7.exibirPosicao();






    }
}
