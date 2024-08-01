import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("CONTADOR DIO\n\n");

        Scanner inputTerminal = new Scanner(System.in);

        System.out.print(" o primeiro parametro (numérico): ");
        int parametro1 = inputTerminal.nextInt();

        System.out.print(" o segundo parametro (numérico): ");
        int parametro2 = inputTerminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            //Thread.dumpStack();
        }

        inputTerminal.close();

    }

    private static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        int contagem = parametro2 - parametro1;
        if(parametro2 < parametro1) {
            throw new ParametrosInvalidosException();
        }

        for(int i = 1; i <= contagem; i++) {
            System.out.printf("imprimindo o numero %d\n", i);
        }

    }
}
