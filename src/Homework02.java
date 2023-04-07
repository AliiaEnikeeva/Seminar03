//Пусть дан произвольный список целых чисел,
// удалить из него чётные числа


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(1, 11));
        }
        System.out.println(list);

        int index = list.size() - 1;
        do {
            if (list.get(index) % 2 == 0) {
                list.remove(index);
            }
            index--;
        } while (index >= 0);
        System.out.println(list);
    }
}
