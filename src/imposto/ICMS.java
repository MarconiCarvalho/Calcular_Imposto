package imposto;

import model.Produto;

public class ICMS implements Imposto{

    @Override
    public float calcularImposto(Produto produto) {

       return (float) (produto.getValor() * 0.18f);

    }

}
