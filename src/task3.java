import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        String[] array = {"cat", "elephant", "dog", "giraffe"};
        String[] result = filterLongStrings(array);

        // Вывод результата
        System.out.println(Arrays.toString(result));
    }

    public static String[] filterLongStrings(String[] array) {
        List<String> filteredList = new ArrayList<>();

        // Добавляем в список только те строки, длина которых больше 3
        for (String str : array) {
            if (str.length() > 3) {
                filteredList.add(str);
            }
        }

        // Преобразуем список обратно в массив
        String[] result = new String[filteredList.size()];
        result = filteredList.toArray(result);

        return result;
    }
}
