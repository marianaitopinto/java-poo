package methods;

public class Piramide {
    private int valor;

    public Piramide(int valor) {
        this.valor = valor;
    }

    public void resolver() {
        for(int i = 1; i<=valor; i++) {
            String piramide = "";
            for(int j = 1; j<=i; j++) {
                piramide = piramide + i;
            }
            System.out.println(piramide);
        }

    }
}
