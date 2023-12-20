import factory.ImpostoFactory;
import factory.TipoImposto;
import imposto.Imposto;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Produto> produtosICMS = new ArrayList<>();
        List<Produto> produtospis= new ArrayList<>();
        List<Produto> produtosipi = new ArrayList<>();
        List<Produto> produtosipi2 = new ArrayList<>();

        Imposto impostoICMS = ImpostoFactory.getImposto(TipoImposto.ICMS);

        Produto produtoICMS = new Produto();
        produtoICMS.setCodigo(1);
        produtoICMS.setDescricao("Arroz");
        produtoICMS.setIndustrial(true);
        produtoICMS.setValor(50);
        produtoICMS.setImpostoCalculado(impostoICMS.calcularImposto(produtoICMS));
        produtosICMS.add(produtoICMS);

        Imposto impostoPIS = ImpostoFactory.getImposto(TipoImposto.PIS);

        Produto produtoPIS = new Produto();
        produtoPIS.setCodigo(2);
        produtoPIS.setDescricao("Feijão");
        produtoPIS.setIndustrial(true);
        produtoPIS.setValor(80);
        produtoPIS.setImpostoCalculado(impostoPIS.calcularImposto(produtoPIS));
        produtospis.add(produtoPIS);

        Imposto impostoIPI = ImpostoFactory.getImposto(TipoImposto.IPI);

        Produto produtoIPI = new Produto();
        produtoIPI.setCodigo(3);
        produtoIPI.setDescricao("Café");
        produtoIPI.setIndustrial(true);
        produtoIPI.setValor(120);
        produtoIPI.setImpostoCalculado(impostoIPI.calcularImposto(produtoIPI));
        produtosipi.add(produtoIPI);

        Imposto impostoIPI2 = ImpostoFactory.getImposto(TipoImposto.IPI);

        Produto produtoIPI2 = new Produto();
        produtoIPI2.setCodigo(4);
        produtoIPI2.setDescricao("Soja");
        produtoIPI2.setIndustrial(false);
        produtoIPI2.setValor(140);
        produtoIPI2.setImpostoCalculado(impostoIPI2.calcularImposto(produtoIPI2));
        produtosipi2.add(produtoIPI2);

        for (Produto produto : produtosICMS) {
            System.out.println("Codigo: "  + produto.getCodigo() + "\nDescrição: " + produto.getDescricao() + "\nIndustrial: " + produto.isIndustrial() + "\nvalor: " + produto.getValor() + "\nImposto: "+ produto.getImpostoCalculado()+"\n\n");
        }
        for (Produto produto : produtospis) {
            System.out.println("Codigo: "  + produto.getCodigo() + "\nDescrição: " + produto.getDescricao() + "\nIndustrial: " + produto.isIndustrial() + "\nvalor: " + produto.getValor() + "\nImposto: "+ produto.getImpostoCalculado()+"\n\n");
        }
        for (Produto produto : produtosipi) {
            System.out.println("Codigo: "  + produto.getCodigo() + "\nDescrição: " + produto.getDescricao() + "\nIndustrial: " + produto.isIndustrial() + "\nvalor: " + produto.getValor() + "\nImposto: "+ produto.getImpostoCalculado()+"\n\n");
        }
        for (Produto produto : produtosipi2) {
            System.out.println("Codigo: "  + produto.getCodigo() + "\nDescrição: " + produto.getDescricao() + "\nIndustrial: " + produto.isIndustrial() + "\nvalor: " + produto.getValor() + "\nImposto: "+ produto.getImpostoCalculado()+"\n\n");
        }

    }

}