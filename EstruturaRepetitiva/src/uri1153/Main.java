package uri1153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fatorial = 1;
        int numero = entrada.nextInt();

        for(int i = numero; i>=1; i--)
            fatorial *= i;

        System.out.println(fatorial);
    }
}
