package methods;

public class MultiplicaAi {
    private int valor;

    public MultiplicaAi(int valor) {
        this.valor = valor;
    }

    public void resolver() {
        System.out.println("Tabela de multiplicação por " + this.valor);
        for(int i = 1; i<11; i++) {
            System.out.println(this.valor + " x " + i + " = " + this.valor * i);
        }

    }
}
