package edu.escuelaing.arsw.ASE.app;

public class ControladorJuego {
    public static void main(String[] args) {
        Juego juego = Juego.getInstance();
        String numeros = "";
        numeros = juego.random();
        String bandera = "";
        System.out.println(numeros);
        while (bandera != "Has ganado") {
            String numerosUsuario = "";
            numerosUsuario = System.console().readLine();
            if ((juego.validador(numerosUsuario)).startsWith("Has ganado")) {
                bandera = "Has ganado";
            } else {
                bandera = (juego.validador(numerosUsuario));

            }
            System.out.println(bandera);

        }

    }
}
