class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[50];

    public boolean addLast(Object e)
    {
        // elementData의 마지막 위치에 인자 e를 추가하세요.
        elementData[size] = e;

        // size를 1 증가시키세요.
        size++;

        return true;
    }
}