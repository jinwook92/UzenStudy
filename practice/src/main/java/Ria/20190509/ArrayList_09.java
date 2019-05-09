class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[50];

    public Object get(int index)
    {
        return elementData[index];
    }

    public String toString()
    {
        // 저장된 데이터를 한 번에 확인할 수 있게 toString을 구현해보세요.
        String str = "";
        for (int i = 0; i < size; i++)
        {
            if (i != 0) str += ",";
            str += elementData[i];
        }
        return "[" + str + "]";
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