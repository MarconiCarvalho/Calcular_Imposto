package imposto;

import model.Produto;

public class IPI implements Imposto{

    public float calcularImposto(Produto produto){

        if(produto.isIndustrial() == true){

            return (float) (produto.getValor() * 0.12f);

        }else if(produto.isIndustrial()== false){

            return 0;
        }else{
            throw new IllegalArgumentException("Industrial Desconhecido");
        }

    }
}
