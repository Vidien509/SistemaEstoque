package TrabAlyAt;

import java.util.Objects;
import java.util.Comparator;

public class OrdPreco implements Comparator<Produto>
{
    public int compare(Produto p1, Produto p2) {
        Float preco1 = p1.getPreco();
        Float preco2 = p2.getPreco();
        if (Objects.isNull(preco1) || Objects.isNull(preco2)) {
            return 0;
        }
        return preco1.compareTo(preco2);
    }
}