package model;

import view.Musica;
import view.Playlist;

public class Principal {
    public static void main(String[] args) {
        // Criando algumas músicas
        Musica musica1 = new Musica("Imagine", "John Lennon", "Apple Records");
        Musica musica2 = new Musica("Bohemian Rhapsody", "Queen", "EMI");
        Musica musica3 = new Musica("Smells Like Teen Spirit", "Nirvana", "DGC Records");

        // Criando uma playlist e adicionando as músicas
        Playlist playlist = new Playlist("Usuário1");
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        playlist.adicionarMusica(musica3);

        // Tocando uma música aleatória
        playlist.tocarMusicaAleatoria();
    }
}