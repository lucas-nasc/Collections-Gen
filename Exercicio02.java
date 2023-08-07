package colections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        int n1, i;


        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("Digite o numero desejado");
        n1 = leia.nextInt();

        for ( i = 0; i < numeros.size(); i++) {
            if (n1 == numeros.get(i)) {
                System.out.println("o numero " + n1 + " esta na posição " + i);
                break;
            }else {
                System.out.println("Não encontrado");
                break;
            }

        }

    }
}
