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
        content.remove(element);
    }

    /**
     * Элемент будет отправлен обратно в конец списка
     * @param element элемент для перемещения в конец
     */
    void moveToBack(E element) {
        if (content.remove(element)) {
            ConcurrentLinkedQueue<E> temp = new ConcurrentLinkedQueue<E>();
            temp.add(element);
            temp.addAll(content);
            content = temp;
        }
    }
}
