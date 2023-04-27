package TrabAlyAt;
import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque
{
    private List<Produto> produtos;
    
    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }
    
    public void addProdutosL(List<Produto> produtos) {
        for (Produto p : produtos) {
            this.produtos.add(p);
        }
    }
    
    public void addProdutos(Produto produtos) {
        this.produtos.add(produtos);
    }
    
    public List<Produto> getProdutos() {
        return this.produtos;
    }
    
    public void ordenaPNome() {
    }
    
    public ArrayList<Produto> buscarProdutos(String termoBusca) {
        ArrayList<Produto> resultados = new ArrayList<Produto>();
        for (Produto p : this.produtos) {
            if (p.getNome().toLowerCase().contains(termoBusca.toLowerCase()) || p.getCodigo().toLowerCase().contains(termoBusca.toLowerCase())) {
                resultados.add(p);
            }
        }
        return resultados;
    }
    
    public void atualizarProduto(String codigo, Produto novoProduto) {
        for (int i = 0; i < this.produtos.size(); ++i) {
            Produto p = this.produtos.get(i);
            if (p.getCodigo().equals(codigo)) {
                this.produtos.set(i, novoProduto);
                return;
            }
        }
    }
    
    public void removerProduto(String codigo) {
        for (int i = 0; i < this.produtos.size(); ++i) {
            Produto p = this.produtos.get(i);
            if (p.getCodigo().equals(codigo)) {
                this.produtos.remove(i);
                return;
            }
        }
    }
    
    public void lerProdutos(String caminhoArquivo) {
        try {
            File arquivo = new File(caminhoArquivo);
            Scanner scanner = new Scanner(arquivo);
            
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dadosProduto = linha.split(",");
                
                String nome = dadosProduto[0];
                String codigo = dadosProduto[1];
                float preco = Float.parseFloat(dadosProduto[2]);
                int quantidade = Integer.parseInt(dadosProduto[3]);
                
                Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
                addProdutos(novoProduto);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    
}