package edu.escuelaing.arsw.ASE.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Juego {

    private static Juego _instance = new Juego();

    public static Juego getInstance() {
        return _instance;
    }

    private String numeroJuego;

    public String getNumeroJuego() {
        return this.numeroJuego;
    }

    public String random() {
        List<Integer> numbers = new ArrayList<Integer>(10);
        for (int i = 1; i < 10; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        numeroJuego = "" + numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3);
        return numeroJuego;
    }

    public String validador(String numerojuegoUsuarios) {
        String picayfama = "";
        int picas = 0;
        int famas = 0;
        List<Character> numero = numeroJuego.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        List<Character> numeroU = numerojuegoUsuarios.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        for (int i = 0; i < 4; i++) {
            if (numero.get(i) == numeroU.get(i)) {
                numero.set(i, (char) 0);
                famas++;
                if (famas == 4) {
                    picayfama = "Has ganado";
                    return picayfama;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if (numero.contains(numeroU.get(i))) {
                numero.set(numero.indexOf(numeroU.get(i)), (char) 0);
                picas++;
            }
            picayfama = ("Picas : " + picas + " Famas: " + famas);
        }
        return picayfama;
    }
}
