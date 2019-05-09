package romi;

public class ArrayTest2Runner {
    public static void main(String[] args)
    {
        ArrayTest2 arraylist = new ArrayTest2();
        for(int i=0; i<1000; i++){
            arraylist.addLast(i);
        }
        return ;
    }
}
