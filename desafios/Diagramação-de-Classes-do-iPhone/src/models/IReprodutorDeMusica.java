package models;

import java.util.List;

public interface IReprodutorDeMusica {
    public void selecionarMusica(String musica);
    public void playMusica();
    public void pausarMusica();    
    public void criarPlaylist(List<String> musicas);

}
