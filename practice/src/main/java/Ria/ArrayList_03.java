import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) {
        ArrayList<String> my_arr_list = new ArrayList<String>();

        my_arr_list.add("hello");
        my_arr_list.add("java");
        my_arr_list.add("world!");

        // 2번째 원소인 "world!"를 삭제하세요.

        my_arr_list.remove(2);

    }
}