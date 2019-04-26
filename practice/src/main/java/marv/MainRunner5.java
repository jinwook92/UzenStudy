package marv;

import java.util.ArrayList;

public class MainRunner5 {
    public static void main(String[] args) {
        ArrayList<String> my_arr_list = new ArrayList<>();

        my_arr_list.add("hello");
        my_arr_list.add("java");
        my_arr_list.add("world!");

        // my_arr_list의 2번째 원소 "java"를 출력해보세요.
        System.out.println(my_arr_list.get(1));
    }
}