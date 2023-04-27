package TrabAlyAt;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

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
}