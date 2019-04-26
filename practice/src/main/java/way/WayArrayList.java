package way;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WayTest {

    public static void main(String[] args) {
        //1. ArrayList - JAVA API 사용해보기(1) - List import

        //2. ArrayList - JAVA API 사용해보기(2) String ArrayList
        List<String> my_arr_list  = new ArrayList<>();

        //3. ArrayList - JAVA API 사용해보기(3) add
        my_arr_list.add("Hello");
        my_arr_list.add("Java");
        my_arr_list.add("World!!");

        //4. ArrayList - JAVA API 사용해보기(4) delete
        my_arr_list.remove(2);

        //5. ArrayList - JAVA API 사용해보기(5) get
        System.out.println(my_arr_list.get(1));

        //6. JAVA API 반복문 쓰기(1) - Iterator
        Iterator<String> it = my_arr_list.iterator();

        //7. ArrayList - JAVA API 반복문 쓰기(2)
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
