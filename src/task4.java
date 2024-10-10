public class task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int average = calculateAverage(array);

        // Вывод результата
        System.out.println("Среднее значение: " + average);
    }

    public static int calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int sum = 0;

        // Суммируем все элементы массива
        for (int num : array) {
            sum += num;
        }

        // Вычисляем среднее значение и округляем его
        double average = (double) sum / array.length;
        return (int) Math.round(average);
    }
}
