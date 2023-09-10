import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) ,
        // / (divisão) e % (módulo).
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // classe Operadores.java

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // classe Operadores.java
        /*
         * Vamos imaginar que n1 começaria com valor 10 e n2 com valor 5
         * mas em seguida gostaria de somar o valor de n1 e n2 e atribuir a n2.
         */
        int n1 = 10;
        int n2 = 5;

        // forma literal
        n2 = n2 + n1;

        // forma abreviada
        n2 += n1;

        System.out.println(n2);

        // classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        String concatenacao = "?";

        int numero = +5; // ou somente 5

        int numero1 = 1;
        int numero2 = 2;

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        concatenacao = 1 + 1 + 1 + "1";

        concatenacao = 1 + "1" + 1 + 1;

        concatenacao = 1 + "1" + 1 + "1";

        concatenacao = "1" + 1 + 1 + 1;

        concatenacao = "1" + (1 + 1 + 1);

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedência conta aqui
        System.out.println(++numero);

        // <Expressão Condicional> ?<Caso condição seja true>: <Caso condição seja
        // false>
        boolean condicao1 = true;
        boolean condicao2 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");
        ;

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        // && - Operador Lógico "E" || - Operador Lógico "OU"
        // Operadores.java
        boolean condicao3 = true;

        boolean condicao4 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao3 e Condicao4 forem verdadeiras, executar código"
         */

        if (condicao3 && condicao4)
            System.out.print("Os dois valores precisam ser verdadeiros");
        ;

        // Se condicao3 OU condicao4 for verdadeira, executar código.
        if (condicao3 || condicao4)
            System.out.print("Um dos valores precisa ser verdadeiro");

    }
}
