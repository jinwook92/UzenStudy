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
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addFirst(Object element)
    {
        // add 메소드를 이용해서 데이터를 첫번째 위치에 저장하는 addFirst함수를 구현하세요.
        return add(0, element);
    }
}