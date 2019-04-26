import java.util.ArrayList;
import java.util.Iterator;

public class MainRunner {
    public static void main(String[] args) {
        ArrayList<String> my_arr_list = new ArrayList<String>();

        my_arr_list.add("hello");
        my_arr_list.add("java");
        my_arr_list.add("world!");

        // my_arr_list의 iterator it을 초기화하세요.
        Iterator<String> it = my_arr_list.iterator();

    }
}