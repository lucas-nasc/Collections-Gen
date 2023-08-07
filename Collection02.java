package colections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection02 {
    public static void main(String[] args) {
        int op;

        Scanner leia = new Scanner(System.in);

        ArrayList<String> estoque = new ArrayList<>();//// podemos criar listas desse jeito

        do{
            System.out.println("\n\t\t Menu de opções");
            System.out.println("\n -------------------------------------------------- ");
            System.out.println("\n (1) Deseja adicionar produtos ao estoque? ");
            System.out.println("\n (2) Deseja remover produtos ao estoque? ");
            System.out.println("\n (3) Deseja atualizar produtos ao estoque? ");
            System.out.println("\n (4) Deseja mostrar todos os produtos do estoque? ");
            System.out.println("\n (0) Deseja encerrar o programa? ");
            System.out.println("\n -------------------------------------------------- ");
            System.out.println("\n Digite a sua opção: ");

            op= leia.nextInt();

            switch (op){
                case 1 :
                    leia.nextLine();
                    System.out.println("\n Digite o produto para adicionar ao estoque: ");

                    String produto = leia.nextLine();
                    estoque.add(produto);
                    break;
                case 2:
                    System.out.println("\n Digite o produto para remover do estoque: ");
                    String produtor = leia.nextLine();
                    if (estoque.contains(produtor)){// Contains verifica se a sequencia de caracteres bate
                        estoque.remove(produtor);
                    }else {
                        System.out.println("Produto não existente");
                    }
                    break;
                case 3:
                    leia.nextLine();
                    System.out.println("\n Digite o produto que quer atualizar: ");
                    String verifica = leia.nextLine();
                    System.out.println("\n Digite o nome do produto que entrara no lugar do " + verifica+" : ");
                    String novo =leia.nextLine();
                    if (estoque.contains(verifica)){
                        estoque.remove(verifica);
                        estoque.add(novo);
                    }else {
                        System.out.println("Produto não existente");
                    }
                    break;
                case 4:
                    System.out.println("\n Os produtos que temos no estoque são: ");
                    System.out.println(estoque);
                    break;
                case 0:
                    System.out.println("\n Muito obrigado por utilizar nosso programa, VOLTE SEMPRE");
                    break;
                default:
                    System.out.println("\n Opeção invalida, digite novamente sua opção");


            }


        }while (op!=0);
    }
}
