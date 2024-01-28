import java.util.Arrays;

import methods.DuplicadosNao;
import methods.Fibonacci;
import methods.MultiplicaAi;
import methods.Piramide;

public class App {
    public static void main(String[] args) {
        resolveMultiplicaAi(6
        );
        resolvePiramide(5);
        String[] firstArray = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] secondArray = {"Manga", "Caqui", "Morango", "Amora", "Uva"};
        resolveDuplicadosNao(firstArray, secondArray);
        resolveFibonacci(20);
    }

    private static void resolveMultiplicaAi(int valor) {
        MultiplicaAi multiplicaAi = new MultiplicaAi(valor);
        multiplicaAi.resolver();
    }

    private static void resolvePiramide(int valor) {
        Piramide piramide = new Piramide(valor);
        piramide.resolver();
    }

    private static void resolveDuplicadosNao(String[] firstArray, String[] secondArray) {
        DuplicadosNao duplicadosNao = new DuplicadosNao(Arrays.asList(firstArray), Arrays.asList(secondArray));
        duplicadosNao.resolver();
    }

    private static void resolveFibonacci(int valor) {
        Fibonacci fibonacci = new Fibonacci(valor); 
        fibonacci.resolver();
    }
}
