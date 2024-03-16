package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
    private List<Musica> listaMusicas;
    private String donoPlaylist;

    public Playlist(String donoPlaylist) {
        this.donoPlaylist = donoPlaylist;
        this.listaMusicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        listaMusicas.add(musica);
    }

    public void tocarMusicaAleatoria() {
        if (listaMusicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
            return;
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaMusicas.size());
        Musica musica = listaMusicas.get(indiceAleatorio);
        System.out.println("Tocando música: " + musica.getNome() + " - " + musica.getAutor());
    }
}