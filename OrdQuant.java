package TrabAlyAt;

import java.util.Objects;
import java.util.Comparator;

public class OrdQuant implements Comparator<Produto>
{

    public int compare(Produto p1, Produto p2) {
        Float quant1 = p1.getQuantidade();
        Float quant2 = p2.getQuantidade();
        if (Objects.isNull(quant1) || Objects.isNull(quant2)) {
            return 0;
        }
        return quant1.compareTo(quant2);
    }
}