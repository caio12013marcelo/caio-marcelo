import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> estoque;

    public void Loja(){
        estoque = new ArrayList<>();
    }
    public void adicionarProduto(Produto p){
        estoque.add(p);
    }
}
