package mirea.pract.pract8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    /**
     * Неограниченная по емкости и ориентированная на многопоточное исполнение очередь content
     */
    protected ConcurrentLinkedQueue<E> content;
    protected ConcurrentLinkedQueue<E> deleted;

    /**
     * Конструктор по умолчанию
     */
    WaitList() {
        content = new ConcurrentLinkedQueue<>();
        deleted = new ConcurrentLinkedQueue<>();

    }

    /**
     * Конструктор с параметрами
     * @param c Коллекция для добавления в очередь
     */
    WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
        deleted = new ConcurrentLinkedQueue<>();
    }

    @Override
    public void add(E element) {
        content.add(element);
    }


    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /**
     * Лист ожидания в стринговом формате
     * @return content[] in string
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (var e : content)
            res.append("\t"+e.toString()).append("\n");
        return res.toString();
    }
}