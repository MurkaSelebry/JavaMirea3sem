package mirea.pract.pract8;

public class BoundedWaitList<E> extends WaitList<E> {

    /**
     * capacity - размер листа (вместимость)
     */
    private int capacity;

    /**
     * Конструктор с параметрами BoundedWaitList
     * @param capacity вместимость
     */

    BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * Получение вместимости
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     * Вставка элемента в BoundedWaitList
     * @param element элемент для вставки
     */
    @Override
    public void add(E element) {
        if (content.size() == capacity){
            System.out.println("Error! *BoundedWaitList* capacity > size");
        }
        else
            content.add(element);

    }
    @Override
    public String toString() {
        return String.format("BoundedWaitList{ capacity = %d, content =\n%s}",capacity,super.toString());
    }
}