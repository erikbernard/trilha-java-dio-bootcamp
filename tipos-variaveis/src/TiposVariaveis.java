public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      // Estrutura
      // Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

      // Exemplo

      int idade = 23;
      double altura = 1.62;
      // Dog spike; //observe que aqui a variável spike não tem valor, é normal

      String BR = "Brasil";
      double PI = 3.14;
      int ESTADOS_BRASILEIRO = 27;
      int ANO_2000 = 2000;

      /*
      Declaração inválida de variáveis
      * -> int numero&um = 1; //Os únicos símbolos permitidos são _ e $ 
      * -> int 1numero = 1;    //Uma variável não pode começar com numérico 
      * -> int numero um = 1; //Não pode ter espaço no nome da variável 
      * -> int long = 1; //long faz parte das palavras reservadas da linguagem 
      */
      
      // Declaração válida de variáveis
      int numero$um = 1;
      int numero1 = 1;
      int numeroum = 1;
      int longo = 1;


      // inferência de tipo
      var variavlesInt = 1; 
      var variavlesString = "1";       
      var variavlesBoolean = false; 
      var variavlesDouble = 1.0; 
      var variavlesFloat = 1.0f;   

      final double VALOR_DE_PI = 3.14;
  
    }
}
