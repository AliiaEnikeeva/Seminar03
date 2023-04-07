//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add(1);
        list.add("qwerty");
        System.out.println(list);

        for (Object o : list) {
            if (o instanceof Integer) {
                list.remove(o);
            }
        }
        System.out.println(list);

    }
}
