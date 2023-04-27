package TrabAlyAt;

public class Produto implements Comparable<Produto>
{
    private String nome;
    private String codigo;
    private float preco;
    private float quantidade;
    
    public Produto(String nome, String codigo, float preco, float quantidade) {
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }
    
 
    public int compareTo(Produto outroProduto) {
        return this.nome.compareTo(outroProduto.getNome());
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public float getQuantidade() {
        return this.quantidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
}