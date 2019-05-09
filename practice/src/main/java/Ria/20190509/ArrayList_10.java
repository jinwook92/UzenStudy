class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[50];

    // 빈칸을 채워 size함수를 구현하세요.
    public int size()
    {
        // 멤버 변수 size를 리턴하세요.
        return size;
    }


    public Object get(int index)
    {
        return elementData[index];
    }

    public String toString()
    {
        String ans = "[";
        for(int i=0; i<size; i++)
        {
            ans += elementData[i];
            if(i<size-1)
            {
                ans += ",";
            }
        }
        ans += "]";
        return ans;
    }

    public boolean addLast(Object e)
    {
        elementData[size++] = e;
        return true;
    }

    public boolean add(int index, Object element)
    {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }
    public boolean addFirst(Object element)
    {
        return add(0, element);
    }
}