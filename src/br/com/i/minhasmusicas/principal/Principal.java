package br.com.i.minhasmusicas.principal;

import br.com.i.minhasmusicas.modelos.MinhasPreferidas;
import br.com.i.minhasmusicas.modelos.Musica;
import br.com.i.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Summer of'69 ");
        minhaMusica.setCantor("Bryan Adams ");

        for (int i = 0; i <1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i <50; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Experience Podcast ");
        meuPodcast.setApresentador("Gustavo Guanabara ");


        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
