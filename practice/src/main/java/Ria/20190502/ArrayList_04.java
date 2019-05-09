import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) {
        ArrayList<String> my_arr_list = new ArrayList<String>();

        my_arr_list.add("hello");
        my_arr_list.add("java");
        my_arr_list.add("world!");

        // my_arr_list의 1번째 원소 "java"를 출력해보세요.
        System.out.println(my_arr_list.get(1));
    }
}