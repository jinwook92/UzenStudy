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
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }

        //elementData의 index에 데이터를 추가하세요.
        elementData[index] = element;

        //size를 1 증가하세요.
        size++;

        return true;
    }
}