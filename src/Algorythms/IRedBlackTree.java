package Algorythms;

/**
 * Коллекция хранит данные в структуре Red-black tree и гарантирует
 * логарифмическое время вставки, удаления и поиска.
 */
public interface IRedBlackTree<T extends Comparable<T>> {

    /**
     * Добавить элемент в дерево
     */
    void add(T o);

    /**
     * Удалить элемент из дерева
     */
    boolean remove(T o);

    /**
     * Возвращает true, если элемент содержится в дереве
     */
    boolean contains(T o);
}