
public class Operadores {
    public static void main(String[] args) throws Exception {
        /*
         * // Operadores de Atribuição
         * String nome = "Danilo";
         * int idade = 43;
         * double peso = 106.5;
         * char sexo = 'M';
         * boolean doadorOrgao = false;
         * Date dataNascimento = new Date();
         * 
         * // Operadores Artitméticos
         * double soma = 10.5 + 15.7;
         * int subtracao = 113 - 25;
         * int multiplicacao = 20 * 7;
         * int divisao = 15 / 3;
         * int modulo = 18 % 3;
         * double resultado = (10 * 7) + (20 / 4);
         * 
         * 
         * // Operador de adição utilizado em Strings servirá como concatenação
         * String nomeCompleto = "LINGUAGEM " + "JAVA";
         * System.out.println(nomeCompleto);
         * 
         * String concatenacao = "?";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + 1 + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + "1" + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + 1 + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + (1 + 1 + 1);
         * System.out.println(concatenacao);
         * 
         * // Operadores Unários
         * int numero = 5;
         * 
         * System.out.println(-numero);
         * System.out.println(numero);
         * 
         * numero = -numero;
         * System.out.println(numero);
         * 
         * numero = numero * -1;
         * System.out.println(numero);
         * 
         * // x repeticao
         * numero++;
         * System.out.println(numero);
         * System.out.println(numero++);
         * System.out.println(numero);
         * System.out.println(++numero);
         * System.out.println(numero--);
         * System.out.println(numero);
         * System.out.println(--numero);
         * 
         * boolean variavel = true;
         * 
         * System.out.println(!variavel);
         * System.out.println(variavel);
         * 
         * variavel = !variavel;
         * 
         * System.out.println(variavel);
         * System.out.println(!variavel);
         * 
         * // Operador Ternário ?
         * int a, b;
         * a = 6;
         * b = 6;
         * 
         * String resultado = "";
         * if (a == b) {
         * resultado = "verdadeiro";
         * } else {
         * resultado = "falso";
         * }
         * 
         * System.out.println(resultado);
         * 
         * resultado = a == b ? "verdadeiro" : "falso";
         * 
         * System.out.println(resultado);
         * 
         * // Operadores Relacionais
         * 
         * int numero1 = 1;
         * int numero2 = 2;
         * 
         * boolean simNao = numero1 == numero2;
         * System.out.println("Numero 1 é igual a numero 2 " + simNao);
         * 
         * simNao = numero1 != numero2;
         * System.out.println("Numero 1 é diferente de numero 2 " + simNao);
         * 
         * simNao = numero1 > numero2;
         * System.out.println("Numero 1 é maior que numero 2 " + simNao);
         * 
         * simNao = numero1 < numero2;
         * System.out.println("Numero 1 é menor que numero 2 " + simNao);
         */

        // Operadores Lógicos && "E" || "OU"

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras!");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições é verdadeira!");
        }

        System.out.println("Fim!");
    }
}
