package aula01_variaveis;

public class VariaveisInteiras {
    public static void main(String[] args) {
        /**Variaveis do tipo Inteira*/
        byte idade1; //Declaração da variavel
        idade1 = 20; //Inicialização da variavel
        short idade2 = 21; //Declaração e inicialização da variavel
        int idade3 = 23;
        long idade4 = 24;

        System.out.println("Valor da variavel idade01: " + idade1);
        System.out.println("Valor da variavel idade02: " + idade2);
        System.out.println("Valor da variavel idade03: " + idade3);
        System.out.println("Valor da variavel idade04: " + idade4);

        System.out.println("\n**** Exemplo 1 ****");
        int numero = 10;
        System.out.println(numero);

        System.out.println("\n**** Exemplo 2 ****");
        int soma = numero + 5;
        System.out.println(soma);

        System.out.println("\n**** Exemplo 3 ****");
        long populacaoMundia = 7_900_000_00L;
        System.out.println(populacaoMundia);

        System.out.println("\n**** Exemplo 4 ****");
        byte idadeMaxima = 127;
        System.out.println(idadeMaxima);

        System.out.println("\n**** Exemplo 5 ****");
        short distanica= 10000;
        System.out.println(distanica);
    }
}
