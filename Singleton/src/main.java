// ponemos aprueba el patron Singleton
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lobby lobby = new Lobby("Elisa", "www.zelda.com");
        boolean control = true;
        int desicion = 0;

        while(control){
            System.out.print("0. Salir, 1. Caracteristicas del server" +
                    ", 2. Ver configuraciones del juego  3. Cambiar configuraciones del juego: "
            );
            desicion = entrada.nextInt();
            if (desicion == 0) {control = false;}

            else if (desicion == 1) {
                System.out.println("Servidor: " + lobby.getNombreLobby());
                System.out.println("URL: " + lobby.getUrlServer());
            }
            else if (desicion == 2) {lobby.verConfiguracion();}

            else if (desicion == 3) {lobby.cambiarConfiguracion();}
        }
    }
}
