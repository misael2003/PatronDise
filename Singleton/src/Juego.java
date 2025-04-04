public class Juego {

    private static Juego instancia = null;

    private final String  nombreJuego = "The Legend Of Zelda";
    private int FPS = 60;
    private int  audio= 10; // numero de integrantes de equipo

    private Juego() {}

    // getters and setters
    public String getNombreJuego() {return this.nombreJuego;}
    public int getFPS() {return this.FPS;}
    public int getAudio() {return this.audio;}

    public void setFPS(int FPS) {this.FPS = FPS;}
    public void setAudio(int audio) {this.audio = audio;}

    // aplicamos singleton
    public static Juego getInstance(){
        if(instancia ==null){
            instancia = new Juego();
        }
        return instancia;
    }
}
