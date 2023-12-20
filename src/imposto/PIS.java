package imposto;

import model.Produto;

public class PIS implements Imposto{
    public float calcularImposto(Produto produto){
        return (float) (produto.getValor() * 0.065f);
    }
}
