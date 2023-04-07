import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework03 {
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(rd.nextInt(1, 5));
        }
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;

        }
        double average = (double) sum / list.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);

    }
}