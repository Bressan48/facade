package padroesestruturais.facade;

import java.text.Normalizer;

public class Convidado {

    public boolean entrarEvento() {
        return ConvidadoFacade.verificaPendenciasEvento(this);
    }
}
