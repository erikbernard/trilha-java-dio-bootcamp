import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ProcessoSeletivo {
    private static final int NUMERO_MAX_TENTATIVAS = 3;
    private static final int NUMERO_CANDIDATOS_SELECIONADOS = 5;
    private static final double SALARIO_BASE = 2000.0;

    public static void main(String[] args) {
        List<Candidato> candidatos = criarCandidatos();

        selecionarCandidatos(candidatos);
    }

    private static List<Candidato> criarCandidatos() {
        String[] nomesCandidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "ALGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "MATEUS" };

        List<Candidato> candidatos = new ArrayList<>();
        for (String nome : nomesCandidatos) {
            candidatos.add(new Candidato(nome));
        }

        return candidatos;
    }

    private static void selecionarCandidatos(List<Candidato> candidatos) {
        int candidatosSelecionados = 0;

        for (Candidato candidato : candidatos) {
            System.out.println("O candidato " + candidato.getNome() + " solicitou o valor de salário "
                    + candidato.getSalarioPretendido());

            if (SALARIO_BASE > candidato.getSalarioPretendido()) {
                candidatosSelecionados++;
                imprimirSelecionado(candidato);
            } else if (SALARIO_BASE == candidato.getSalarioPretendido()) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
                entrarEmContato(candidato.getNome());
            } else {
                System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
            }

            if (candidatosSelecionados >= NUMERO_CANDIDATOS_SELECIONADOS) {
                break; // Já selecionou o número desejado de candidatos
            }
        }
    }

    private static void imprimirSelecionado(Candidato candidato) {
        System.out.println("O candidato selecionado foi o " + candidato.getNome());
        entrarEmContato(candidato.getNome());
    }

    private static void entrarEmContato(String candidatoNome) {
        int tentativasRealizadas = 0;

        for (int i = 0; i < NUMERO_MAX_TENTATIVAS; i++) {
            if (atender()) {
                System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidatoNome + " NA TENTATIVA " + (i + 1));
                return;
            } else {
                tentativasRealizadas++;
            }
        }

        System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidatoNome + " NUMERO MAXIMO DE TENTATIVAS "
                + tentativasRealizadas);
    }

    private static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
