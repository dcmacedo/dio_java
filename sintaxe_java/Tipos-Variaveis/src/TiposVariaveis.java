public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2 + salarioMinimo);

        int numero = 5;

        numero = 10;

        System.out.println(numero);
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
