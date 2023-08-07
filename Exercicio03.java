package colections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>(); //criação da estrutura Set não ira repetir os elementos e colocar em ordem
        Scanner leia =new Scanner(System.in);



        for (int i = 0; i <10 ; i++) {
            System.out.println("Digite os numeros desejados");

           int nota = leia.nextInt();

           numeros.add(nota);

        }
        System.out.println(numeros);
        System.out.println("\nListar dados do Set:");

        for (Integer nota:numeros){
            System.out.println(nota);
        }

        System.out.println("\nListar dados do Set:\n");

        Iterator<Integer> meuSet = numeros.iterator();// é um metodo que percorre a lista



        while (meuSet.hasNext()){//hashNext é um boolean  e um metodo que utilizamos para percorrer uma lista

            System.out.println(meuSet.next());
        }








    }
}
