package colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Digite a cor que deseja: ");

            String cor = leia.nextLine();
            lista.add(cor);
        }

        System.out.println(lista);
        System.out.println("\nListar todas as cores: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }


        Collections.sort(lista);
        System.out.println("\nCores ordenada: ");

        for (int i =0 ; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("\n-----------------");
        System.out.println(lista);



    }
}
