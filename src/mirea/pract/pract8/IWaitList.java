package mirea.pract.pract8;
import java.util.Collection;

public interface IWaitList<E> {
    /**
     * Вставка элемента в лист ожидания
     * @param element элемент для вставки
     */
    void add(E element);

    /**
     * Удаление элемента (головного) из листа ожидания
     * @return Удаленный элемент
     */
    E remove();

    /**
     * Проверка на содержание элемента в листе ожидания
     * @param element Элемент для проверки
     * @return Результат проверки: true/false
     */
    boolean contains(E element);

    /**
     * Проверка на содержание всех элементов в листе ожидания
     * @param c Коллекция для проверки в листе ожидания
     * @return Результат проверки: true/false
     */
    boolean containsAll(Collection<E> c);

    /**
     * Проверка листа ожидания на пустоту
     * @return Результат проверки: true/false
     */
    boolean isEmpty();


}