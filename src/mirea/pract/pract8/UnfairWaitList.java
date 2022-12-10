package mirea.pract.pract8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * Конструктор по умолчанию
     */
    UnfairWaitList() {
        super();
    }

    /**
     * Удалить элемент, который не является первым в очереди
     * @param element элемент для удаления
     */
    public void remove(E element) {
        if (element != content.peek()) {
            deleted.add(element);
            content.remove(element);
        }
        else
            moveToBack(element);
    }
    public void add(E element){
        if (deleted.contains(element)){
            System.out.println("Can't be added");
        }
        else{
            content.add(element);
        }
    }
    /**
     * Элемент будет отправлен обратно в конец списка
     * @param element элемент для перемещения в конец
     */
    void moveToBack(E element) {
        content.add(element);
        content.remove(element);
    }
    @Override
    public String toString() {

        return String.format("Unfair{ content =\n%s}",super.toString());
    }
}
