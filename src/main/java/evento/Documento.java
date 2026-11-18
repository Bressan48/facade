package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Documento {

    private List<Convidado> convidadosComPendencia = new ArrayList<Convidado>();

    public void addConvidadoPendente(Convidado convidado) {
        this.convidadosComPendencia.add(convidado);
    }

    public boolean verificarConvidadoComPendencia(Convidado convidado) {
        return this.convidadosComPendencia.contains(convidado);
    }

}

