package src.main.java.way.week2;


public class MainRunner {
    public static void main(String[] args)
    {
        ArrayList arraylist = new ArrayList();
        for(int i=0; i<1000; i++){
            arraylist.addLast(i);
        }
        System.out.print(arraylist.toString() );
        return ;
    }
}
