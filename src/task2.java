import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] result = getUniqueElements(array);

        // Вывод результата
        System.out.println(Arrays.toString(result));
    }

    public static int[] getUniqueElements(int[] array) {
        // Используем Set для хранения уникальных элементов
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        // Добавляем элементы массива в Set, который автоматически удаляет дубликаты
        for (int num : array) {
            uniqueSet.add(num);
        }

        // Преобразуем Set обратно в массив
        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            result[index++] = num;
        }

        return result;
    }
}