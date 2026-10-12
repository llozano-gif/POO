package logica;

import java.util.ArrayList;
import modelo.Palabra;

public class POOJuegoAhorcado {

    private Palabra palabraActual;
    private ArrayList<Character> letrasCorrectas;
    private ArrayList<Character> letrasIncorrectas;

    private int intentos;

    private final int MAX_INTENTOS = 7;

    public POOJuegoAhorcado(Palabra palabra) {

        this.palabraActual = palabra;

        letrasCorrectas = new ArrayList<>();
        letrasIncorrectas = new ArrayList<>();

        intentos = 0;
    }

    public boolean adivinarLetra(char letra) {

        letra = Character.toUpperCase(letra);

        String palabra = palabraActual.getPalabra();

        // Si la letra está dentro de la palabra
        if (palabra.indexOf(letra) >= 0) {

            if (!letrasCorrectas.contains(letra)) {
                letrasCorrectas.add(letra);
            }

            return true;

        } else {

            // Si la letra NO está en la palabra
            if (!letrasIncorrectas.contains(letra)) {
                letrasIncorrectas.add(letra);
                intentos++;
            }

            return false;
        }
    }

    public boolean juegoGanado() {

        String palabra = palabraActual.getPalabra();

        for (char letra : palabra.toCharArray()) {

            if (!letrasCorrectas.contains(letra)) {
                return false;
            }
        }

        return true;
    }

    public boolean juegoPerdido() {

        return intentos >= MAX_INTENTOS;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getMaxIntentos() {
        return MAX_INTENTOS;
    }

    public ArrayList<Character> getLetrasCorrectas() {
        return letrasCorrectas;
    }

    public ArrayList<Character> getLetrasIncorrectas() {
        return letrasIncorrectas;
    }

    public Palabra getPalabraActual() {
        return palabraActual;
    }
}