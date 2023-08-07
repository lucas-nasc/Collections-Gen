package colections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio04 {
    public static void main(String[] args) {

        int n1;

        Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

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

        for (Integer lista:numeros) {
            if (numeros.contains(n1)){
                System.out.println("o numero "+ n1+" foi encontrado");
                break;
            }else {
                System.out.println("O numero "+n1 +" não encontrado");
                break;
            }
        }

    }
}
