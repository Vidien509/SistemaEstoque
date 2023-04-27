package TrabAlyAt;

import java.util.Comparator;

public class OrdNome implements Comparator<Produto>
{
    public int compare(Produto p1, Produto p2) {
    	/*Comparação ignorando maiusculas e minusculas*/
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
}