package padroesestruturais.facade;

public class ConvidadoFacade {

    public static boolean verificaPendenciasEvento(Convidado convidado) {
        if (Empresa.getInstancia().verificarConvidadoComPendencia(convidado)) {
            return false;
        }
        if (Cracha.getInstancia().verificarConvidadoComPendencia(convidado)) {
            return false;
        }
        if (Ingresso.getInstancia().verificarConvidadoComPendencia(convidado)) {
            return false;
        }
        return true;
    }
}
