package customDS;

public class ArrayListCustom<T> {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListCustom() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int size (){
        return size;
    }
    public void growCapacity(){
        if(size == elements.length -1){
            int newCapacity = elements.length * 2;
            T[] newElements = (T[]) new Object[newCapacity];
            System.arraycopy(elements,0, newElements,0,size);
            elements = newElements;
        }
    }
    public T get(int index){
        if(index < 0|| index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds" + index);
        return elements[index];
    }
    public void add(T element){
        growCapacity();
        elements[size++] = element;
        size++;
    }
    public void remove(int index){
        if(index < 0|| index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds" + index);

        T elementValue = elements[index];
        for (int i = index; i<= size-1; i++){
            elements[i] = elements[i+1];
        }
        size--;
        elements[size] = null;
    }
    public boolean contains(T element){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)) return true;
        }
        return false;
    }
    public void clear(){
        for(int i = 0; i< size; i++){
            elements[i] = null;
        }
        size = 0;
    }
}
