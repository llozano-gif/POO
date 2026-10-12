package modelo;

public class Palabra {

    private String palabra;
    private String categoria;
    private String pista;

    public Palabra(String palabra, String categoria, String pista) {
        this.palabra = palabra;
        this.categoria = categoria;
        this.pista = pista;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPista() {
        return pista;
    }
}