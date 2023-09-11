import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
    private String nome;
    private double salarioPretendido;

    public Candidato(String nome) {
        this.nome = nome;
        this.salarioPretendido = valorPretendido();
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }

    private double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }
}
