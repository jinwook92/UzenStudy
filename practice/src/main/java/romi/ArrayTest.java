package romi;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest 
{ 
    public static void main(String[] args) 
    {
        ArrayList<String> my_arr_list = new ArrayList<String>();

        my_arr_list.add("hello");
        my_arr_list.add("java");
        my_arr_list.add("world!");

        Iterator<String> it = my_arr_list.iterator();

        // while문으로 my_arr_list의 모든 원소를 출력해봅시다.
        while( it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}