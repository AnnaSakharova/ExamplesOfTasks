package myarraylist;

// Iterable понадобится чтобы успешно работать с АррейЛистом
public interface SimpleList<E> extends Iterable<E> {
    boolean add(E e);

    E get(int index);

    void delete(int index);

    int size();

    // Обновление значения по индексу
    void update(int index, E e);
}
