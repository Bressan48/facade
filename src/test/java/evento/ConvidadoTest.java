package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvidadoTest {

    @Test
    void deveRetornarPendenciaCrachaEvento() {
        Convidado convidado = new Convidado();
        Cracha.getInstancia().addConvidadoPendente(convidado);

        assertEquals(false, convidado.entrarEvento());
    }

    @Test
    void deveRetornarPendenciaEmpresaEvento() {
        Convidado convidado = new Convidado();
        Empresa.getInstancia().addConvidadoPendente(convidado);

        assertEquals(false, convidado.entrarEvento());
    }

    @Test
    void deveRetornarPendenciaIngressoEvento() {
        Convidado convidado = new Convidado();
        Ingresso.getInstancia().addConvidadoPendente(convidado);

        assertEquals(false, convidado.entrarEvento());
    }

    @Test
    void deveRetornarConvidadoSemPendenciaEvento() {
        Convidado convidado = new Convidado();

        assertEquals(true, convidado.entrarEvento());
    }

}