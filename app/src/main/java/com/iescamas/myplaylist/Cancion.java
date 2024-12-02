package com.iescamas.myplaylist;

public class Cancion {

    private String titulo;
    private String nombreAutor;
    private int portada;
    private int audio;

    public Cancion() {}

    public Cancion(String titulo, String nombreAutor, int portada,int audio) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.portada = portada;
        this.audio = audio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getMusica() {
        return portada;
    }

    public void setMusica(int musica) {
        this.portada = musica;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }
}
