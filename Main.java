package TrabAlyAt;

import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(final String[] args) {
        Estoque e1 = new Estoque();
        /*
        Produto p1 = new Produto("Caneta", "A01", 2.9f, 16.0f);
        Produto p2 = new Produto("Agulha", "A09", 1.5f, 160.0f);
        Produto p3 = new Produto("Borracha", "A03", 5.9f, 34.0f);
        Produto p4 = new Produto("Monitor", "A06", 1500.9f, 6.0f);
        Produto p5 = new Produto("Uva", "A02", 10.9f, 30.0f);
        */
        e1.lerProdutos("C:\\Users\\Libertas\\Desktop\\Cezar\\estoque.txt");
        //ArrayList<Produto> l = new ArrayList<Produto>(Arrays.asList());
        //e1.addProdutosL(l);
        
        System.out.println("Estoque no momento:");
        for (Produto p : e1.getProdutos()) {
            System.out.println("Produto " + p.getNome() + "|" + " Preço: " + p.getPreco() + "|" + " Código: " + p.getCodigo() + "|" + " Quandidade: " + p.getQuantidade());
        }
        
        System.out.println("--------------------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de ordenação:\nProduto[1]\nPreço[2]\nCódigo[3]\nQuantidade[4]\nSair[5]\n");
        System.out.println("--------------------------------------------------------------");
        
        int a =  sc.nextInt(); 
        if (a == 0) a=6;
        while (a != 0){
    		if(a == 5) {
    			System.out.println("Finalizando programa...");
    			return;
    		}
            
            if (a == 1) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("Ordenação por nome:");
                Collections.sort(e1.getProdutos(), new OrdNome());
                for (Produto p : e1.getProdutos()) {
                    System.out.println("Produto " + p.getNome() + "|" + " Preço: " + p.getPreco() + "|" + " Código: " + p.getCodigo() + "|" + " Quandidade: " + p.getQuantidade());
                }
                a = 0;
                System.out.println("--------------------------------------------------------------");
            }
            else if (a == 2) {
                System.out.println("Ordenação por preço:");
                Collections.sort(e1.getProdutos(), new OrdPreco());
                for (Produto p : e1.getProdutos()) {
                    System.out.println("Produto: " + p.getNome() + " Preço: " + p.getPreco() + " Código: " + p.getCodigo() + " Quandidade: " + p.getQuantidade());
                }
                a = 0;
                System.out.println("--------------------------------------------------------------");
            }
            else if (a == 3) {
                System.out.println("Ordenação por código:");
                Collections.sort(e1.getProdutos(), new OrdCod());
                for (Produto p : e1.getProdutos()) {
                    System.out.println("Produto " + p.getNome() + " Preço: " + p.getPreco() + " Código: " + p.getCodigo() + " Quandidade: " + p.getQuantidade());
                }
                a = 0;
                System.out.println("--------------------------------------------------------------");
            }
            else if (a == 4) {
                System.out.println("Ordenação por quantidade:");
                Collections.sort(e1.getProdutos(), new OrdQuant());
                for (Produto p : e1.getProdutos()) {
                    System.out.println("Produto: " + p.getNome() + " Preço: " + p.getPreco() + " Código: " + p.getCodigo() + " Quandidade: " + p.getQuantidade());
                }
                a = 0;
                System.out.println("--------------------------------------------------------------");
            }
            else {
                System.out.println("Comando Inválido!.");
                a = sc.nextInt();
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o termo de busca: ");
        String termoBusca = scanner.nextLine();
        ArrayList<Produto> resultados = (ArrayList<Produto>)e1.buscarProdutos(termoBusca);
        if (resultados.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        }
        else {
            System.out.println("----------------------------------------");
            System.out.println("Resultados da busca:");
            for (Produto p : resultados) {
                System.out.println("Produto: " + p.getNome() + "| Preço: " + p.getPreco() + "| Código: " + p.getCodigo() + "| Quantidade: " + p.getQuantidade());
            }
        }
        ArrayList<Produto> l1 = (ArrayList<Produto>)e1.getProdutos();
        System.out.println("\nAtualizar produto, digite o código do produto que deseja atualizar.");
        String c = sc.next();
        System.out.println("Digite o novo nome do produto, preço e quantidade");
        Produto novoProduto = new Produto(sc.next(), l1.get(l1.size()-1).getCodigo()+1, sc.nextFloat(), sc.nextFloat());
        e1.atualizarProduto(c, novoProduto);
        System.out.println("----------------------------------------");
        System.out.println("Atualizando Produto:");
        for (Produto p : e1.getProdutos()) {
            System.out.println(p.getNome());
        }
        System.out.println("\nRemover produto, digite o código do produto que deseja remover.");
        c = sc.next();
        e1.removerProduto(c);
        System.out.println("----------------------------------------");
        System.out.println("Removendo Produto:");
        for (Produto p : e1.getProdutos()) {
            System.out.println(p.getNome());
        }
    }
}