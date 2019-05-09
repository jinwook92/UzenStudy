class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[50];

    public boolean addLast(Object element)
    {
        elementData[size++] = element;
        return true;
    }
    // int 타입 index와 Object 타입 element를 인자로 받는 public 함수 add를 완성하세요.
    // add 함수는 boolean을 리턴합니다.
    public boolean add(int index, Object element)
    {
        return true;
    }
}