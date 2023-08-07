package colections;

import java.util.*;

public class Colections {
    public static void main(String[] args) {

        List<Integer> minhaLista = new ArrayList<Integer>();// podemos criar listas desse jeito

        minhaLista.add(2);//Adiciona um elemento na minha arrayList
        minhaLista.add(5);
        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.add(4);
        minhaLista.add(3);

        for (Integer listaElementos:minhaLista){ // visualiza os elementos do meu arrayLista
            System.out.println(listaElementos);
        }

        System.out.println("\n Removendo um elemento da lista ");
        System.out.println();

        minhaLista.remove(0);//Remove um elemento do arrayList

        for (Integer listaElementos:minhaLista){ //ListaElelemtos vai ver a minha lista e retornar os numeros
            System.out.println(listaElementos);
        }

        int primeiroElemento = minhaLista.get(0); // metodo get para pegar o elemento desejado

        System.out.println("\n O primeiro elemento é: "+ primeiroElemento);
        System.out.println();

        for (int i = 0; i <minhaLista.size(); i++) { //size == Tamanho
            System.out.println("\n elementos: " + minhaLista.get(i));

        }

        Collections.sort(minhaLista); // o sort vai colocar em ordem crescente o arrayList
        System.out.println("\n Depois de ordenado...");
        System.out.println(minhaLista);
        System.out.println();

        Set<Integer> meuSet = new HashSet<Integer>();// criação da estrutura Set não ira repetir os elementos e colocar em ordem

        meuSet.add(2);// Adicionando elementos no Hash Set
        meuSet.add(5);
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(1);
        meuSet.add(3);
        meuSet.add(5);

        Iterator <Integer> iMeuSet = meuSet.iterator(); // é um metodo que utilizamos para percorrer uma lista

        //Enquanto tiver elementos ira repitir
        while (iMeuSet.hasNext()){//hashNext é um boolean

            System.out.println(iMeuSet.next());
        }





    }
}
