public class FormatarCep {

    public static void main(String[] args) {
        try {
            String cep = "23765064";
            String cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
