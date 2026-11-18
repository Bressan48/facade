package padroesestruturais.facade;

public class Ingresso extends Documento {

    private static Ingresso ingresso = new Ingresso();

    private Ingresso() {};

    public static Ingresso getInstancia() {
        return ingresso;
    }
}
