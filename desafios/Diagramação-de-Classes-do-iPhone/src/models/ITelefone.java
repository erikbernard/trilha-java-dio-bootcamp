package models;

public interface ITelefone {
    public void chamadar(String numeroDoTelefone);
    public void atender();    
    public void enviarMensagem();    
    public void escreverMensagem(String mensagem);
    public void correioDeVoz();
}
