import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, -1, 7, -4, 0, 9, -6};
        int[] result = removeNegatives(array);

        // Вывод результата
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeNegatives(int[] array) {
        List<Integer> positiveList = new ArrayList<>();

        for (int num : array) {
            if (num >= 0) {
                positiveList.add(num);
            }
        }

        // Преобразуем список обратно в массив
        int[] result = new int[positiveList.size()];
        for (int i = 0; i < positiveList.size(); i++) {
            result[i] = positiveList.get(i);
        }

        return result;
    }
}
