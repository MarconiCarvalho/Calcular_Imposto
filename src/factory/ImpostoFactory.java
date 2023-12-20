package factory;

import imposto.ICMS;
import imposto.IPI;
import imposto.Imposto;
import imposto.PIS;

public class ImpostoFactory {

    public static Imposto getImposto(TipoImposto tipo){


        switch(tipo){
            case ICMS:

                return new ICMS();

            case IPI:

                return new IPI();

            case PIS:

                return new PIS();

            default:

                throw new IllegalArgumentException("Tipo de Imposto Desconhecido");
        }


    }

}
