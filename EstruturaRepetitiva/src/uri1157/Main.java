package uri1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        for(int i = 1; i<= numero; i++){
            if(numero%i == 0)
                System.out.println(i);
        }
    }
}
