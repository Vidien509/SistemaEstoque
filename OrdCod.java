package TrabAlyAt;

import java.util.Comparator;

public class OrdCod implements Comparator<Produto>
{
    public int compare(Produto p1, Produto p2) {
        return p1.getCodigo().compareToIgnoreCase(p2.getCodigo());
    }
}