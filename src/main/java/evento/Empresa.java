package padroesestruturais.facade;

public class Empresa extends Documento {

    private static Empresa empresa = new Empresa();

    private Empresa() {};

    public static Empresa getInstancia() {
        return empresa;
    }

}
