package way;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WayTest {

    public static void main(String[] args) {
        //1. List import

        //2. String ArrayList Declare
        List<String> my_arr_list  = new ArrayList<>();

        //3.add
        my_arr_list.add("Hello");
        my_arr_list.add("Java");
        my_arr_list.add("World!!");

        //4. delete
        my_arr_list.remove(2);

        //5. get
        System.out.println(my_arr_list.get(1));

        //6. Iterator
        Iterator<String> it = my_arr_list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
