class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[50];

    public boolean addLast(Object e)
    {
        elementData[size++] = e;
        return true;
    }

    public boolean add(int index, Object element)
    {
        //끝부터 index번째까지의 데이터를 한칸씩 뒤로 이동시키세요.
        for(int i=size-1; i>=index ; i--)
        {
            elementData[i+1] = elementData[i];
        }

        return true;
    }
}