import java.util.Scanner;
public class Lobby {

    private String nombreLobby;
    private String urlServer = "";

    public Lobby(String nombreLobby, String urlServer) {
        this.nombreLobby = nombreLobby;
        this.urlServer = urlServer;
    }

    // getters and setters

    public String getNombreLobby() {return nombreLobby;}
    public void setNombreLobby(String nombreLobby) {this.nombreLobby = nombreLobby;}

    public String getUrlServer() {return urlServer;}
    public void setUrlServer(String urlServer) {this.urlServer = urlServer;}

    // algunas funcionalidades

    public void verConfiguracion(){
        Juego zelda = Juego.getInstance();
        System.out.println("Nombre: " + zelda.getNombreJuego());
        System.out.println("FPS: " + zelda.getFPS());
        System.out.println("Audio: " + zelda.getAudio());
    }

    public void cambiarConfiguracion(){
        Juego zelda = Juego.getInstance();
        Scanner entrada = new Scanner(System.in);
        int desicion = 0;
        boolean control = true;

        while (control){
            System.out.print("1. Cambiar fps, 2. Cambiar audio: ");
            desicion = entrada.nextInt();
            switch(desicion){
                case 1:
                    int fps = 0;
                    System.out.print("FPS: ");
                    fps = entrada.nextInt();
                    zelda.setFPS(fps);
                    break;
                case 2:
                    int audio = 0;
                    System.out.print("audio: ");
                    audio = entrada.nextInt();
                    zelda.setAudio(audio);
                    break;
            }
            control = false;
        }
    }
}
