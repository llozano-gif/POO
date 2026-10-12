package logica;

import java.util.ArrayList;
import java.util.Random;
import modelo.Palabra;

public class BancoPalabras {

    private ArrayList<Palabra> palabras;

    public BancoPalabras() {

        palabras = new ArrayList<>();

        agregarPalabras();
    }

    private void agregarPalabras() {

        palabras.add(new Palabra(
                "PERRO",
                "Animales",
                "Es el mejor amigo del hombre"
        ));

        palabras.add(new Palabra(
                "GATO",
                "Animales",
                "Es un animal doméstico que maúlla."
        ));

        palabras.add(new Palabra(
                "COLOMBIA",
                "Países",
                "País reconocido por su café."
        ));

        palabras.add(new Palabra(
                "FUTBOL",
                "Deportes",
                "Deporte que se juega con un balón entre dos equipos."
        ));

        palabras.add(new Palabra(
                "PIZZA",
                "Comidas",
                "Comida italiana preparada con masa, salsa y queso."
        ));

        palabras.add(new Palabra(
                "MARTILLO",
                "Objetos",
                "Herramienta utilizada para golpear."
        ));
    }

    public Palabra obtenerPalabraAleatoria() {

        Random random = new Random();

        int posicion = random.nextInt(palabras.size());

        return palabras.get(posicion);
    }

    public ArrayList<Palabra> getPalabras() {
        return palabras;
    }
}