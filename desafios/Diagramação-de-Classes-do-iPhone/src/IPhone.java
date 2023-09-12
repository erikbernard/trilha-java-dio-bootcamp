import java.util.List;

import models.INavegadorDeInternet;
import models.IReprodutorDeMusica;
import models.ITelefone;

public class IPhone implements ITelefone, INavegadorDeInternet, IReprodutorDeMusica {

    String numero;

    public IPhone(String numero) {
        this.numero = numero;
    }

    @Override
    public void chamadar(String numeroDeTelefone) {
        System.out.println("Ligando para o numero: " + numeroDeTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando correo de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina web");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Unimplemented method 'enviarMensagem'");
    }

    @Override
    public void escreverMensagem(String mensagem) {
        System.out.println("Unimplemented method 'escreverMensagem'");
    }

    @Override
    public void playMusica() {
        System.out.println("Unimplemented method 'playMusica'");
    }

    @Override
    public void criarPlaylist(List<String> musicas) {
        System.out.println("Unimplemented method 'criarPlaylist'");
    }
}