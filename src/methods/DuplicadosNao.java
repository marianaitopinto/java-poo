package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DuplicadosNao {
    private List<String> firstArray = new ArrayList<>();
    private List<String> secondArray = new ArrayList<>();

    public DuplicadosNao(List<String> firstArray, List<String> secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

    public void resolver() {
        for (int i = 0; i < firstArray.size(); i++) {
            for (int j = 0; j < secondArray.size(); j ++) {
                if (Objects.equals(secondArray.get(j), firstArray.get(i))) {
                    System.out.println(secondArray.get(j));
                }
            }
        }
    }
}
