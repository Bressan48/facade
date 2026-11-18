package padroesestruturais.facade;

import java.util.ArrayList;

public class Cracha extends Documento {

    private static Cracha cracha = new Cracha();

    private Cracha() {};

    public static Cracha getInstancia() {
        return cracha;
    }
}
