package methods;

public class Fibonacci {
    private int valor;

    public Fibonacci(int valor) {
        this.valor = valor;
    }

    public void resolver() {
        int n1 = 0;
        int n2 = 1;
        for (int i = valor; i > 0; i--) {
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}