package mirea.lab.lab7;

import java.util.*;



public class MyArrayList<E> implements Iterable<E>
{
    private  int size;
    private final static int DEFAULT_CAPACITY=10;
    private Object[] elementData;
    public MyArrayList(){
        elementData=new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity){
        if (capacity>=0){
            elementData=new Object[capacity];
        }else{
            throw  new IllegalArgumentException("Illegal Argument:"+capacity);
        }
    }
    public boolean add(E e){
        if(isFull()) expandCapacity();
        elementData[size++]=e;
        return false;
    }


    public void add(int index,E e){
        rangeCheck(index);
        if (isFull()) expandCapacity();
        System.arraycopy(elementData,index,elementData, index+1,size-index);
        elementData[index]=e;
        size++;
    }

    public boolean remove(Object e){
        if (e==null){
            for (int i=0;i<size;i++){
                if (elementData[i]==e){
                    remove(i);
                    return true;
                }
            }
        }else {
            for (int i=0;i<size;i++){
                if (e.equals(elementData[i])){
                    remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public E remove(int index){
        rangeCheck(index);
        E value=(E)elementData[index];
        int numMoved=size-index-1;
        System.arraycopy(elementData,index+1,elementData,index,numMoved);
        elementData[--size]=null;
        return value;
    }

    public boolean contains(Object ob) {
        return indexOf(ob) >= 0;
    }


    public int indexOf (Object n) {
        for (int i = 0; i < this.elementData.length; i++) {
            if (n.equals(this.elementData[i])) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf (Object n) {
        for (int i = this.elementData.length-1; i >= 0; i--) {
            if (n.equals(this.elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    private boolean isFull(){
        return size==elementData.length;
    }

    private void expandCapacity(){
        Object [] newArr=new Object[getNewCapacity()];
        System.arraycopy(elementData,0,newArr,0,elementData.length);
        elementData=newArr;
    }


    private int getNewCapacity(){
        int oldCapacity=elementData.length;
        int newCapacity=elementData.length+(elementData.length>>1);

        if (newCapacity==oldCapacity){
            return newCapacity+1;
        }

        return newCapacity;
    }

    public int size(){
        return size;
    }

    private void rangeCheck(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > elementData.length - 1)
            throw new IndexOutOfBoundsException("Index" + index + "is out of bounds");
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }

        if (size!=0){
            sb.setCharAt(sb.length()-1,']');
            return sb.toString();
        }

        return "[]";
    }

    public E get(int index){
        rangeCheck(index);
        return (E)elementData[index];
    }


    public E set(int index, E element){
        rangeCheck(index);
        elementData[index]=element;
        return element;
    }


    public void trimToSize(){
        if (size<elementData.length){
            elementData= Arrays.copyOf(elementData,size);
        }
    }

    public int getCapacity(){
        return elementData.length;
    }

    public void sort(Comparator<? super E> comparator){
        Arrays.sort((E[]) elementData, 0, size, comparator);
    }



    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(elementData, 0, newArray, 0, size);
        return newArray;
    }

    public Iterator<E> iterator() {
        return new MyListIterator();
    }


    class MyListIterator implements Iterator<E>{

        private int index = 0;


        public boolean hasNext() {
            return index < size;
        }




        public E next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException();
            }
            return get(index++);
        }






    }
}
